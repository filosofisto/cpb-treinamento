package com.x25.logicajava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Main {

	public static void main(String[] args) {
		try {
			File fin = new File("/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/io10/pom.xml");
			System.out.printf("Tamanho original: %d\n", fin.length());
			File fout = new File("/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/io10/pom.xml.gzip");
			compactarGZip(
					new FileInputStream(fin),
					new FileOutputStream(fout)
			);
			System.out.printf("Tamanho compactado: %d\n", fout.length());
			System.out.printf("Percentual Ganho %f", fout.length()*1.0/fin.length()*100);
		} catch (Exception e) {
			
		}
	}
	
	public static void compactarGZip(InputStream in, OutputStream out) 
			throws IOException {
		byte[] buf = new byte[512];
		int off = 0;
		int len = buf.length;
		
		GZIPOutputStream gzip = 
				new GZIPOutputStream(out);
		while ((len = in.read(buf, off, len)) != -1) {
			gzip.write(buf, off, len);
		}
		
		gzip.close();
	}
	
	public static void descompactarGZip(InputStream in, OutputStream out) 
			throws IOException {
		byte[] buf = new byte[512];
		int off = 0;
		int len = buf.length;
		
		GZIPInputStream gzip = new GZIPInputStream(in);
		
		while ((len = gzip.read(buf, off, len)) != -1) {
			out.write(buf, off, len);
		}
		
		out.close();
		gzip.close();
	}
}

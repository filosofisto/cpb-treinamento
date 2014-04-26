package com.javabasico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter(new File("/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/io8/teste.html"));
			/*out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			out.println("<elementos>");
			out.println("\t<elemento>Linha 1</elemento>");
			out.println("\t<elemento>Linha 2</elemento>");
			out.println("</elementos>");*/
			out.println("<html>");
			out.println("<body>");
			out.println("<form>");
			out.println("<input type='text'/>");
			out.println("<input type='submit'/>");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

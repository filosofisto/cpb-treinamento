package com.x25.logicajava;

import java.io.File;
import java.io.FileFilter;

public class NaoVazios implements FileFilter {

	@Override
	public boolean accept(File file) {
		return file.length() > 0 && file.isFile();
	}

}

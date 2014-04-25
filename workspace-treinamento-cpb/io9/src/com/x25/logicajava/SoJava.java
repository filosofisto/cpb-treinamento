package com.x25.logicajava;

import java.io.File;
import java.io.FilenameFilter;

public class SoJava implements FilenameFilter {

	@Override
	public boolean accept(File parent, String name) {
		return name.endsWith(".jar");
	}

}

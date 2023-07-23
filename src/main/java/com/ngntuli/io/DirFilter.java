package com.ngntuli.io;

import java.io.File;
import java.io.FilenameFilter;

public class DirFilter implements FilenameFilter {

	// Holds filtering criteria
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".jpeg") || name.endsWith(".JPEG");
	}

}

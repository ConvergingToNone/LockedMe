package LockedMe;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;


public class HandleOptions {
	
	public static Boolean checkIfExists(String file, File[] dir) {
		naiveStringMatching nsm = new naiveStringMatching();
		for (File f : dir) {
		if (naiveStringMatching.match(file, f.getName()) == true) { return true;};
		}
		
		return false;
		
	}
	
	public static void copyFile(File sourceFile, File destFile) throws IOException {
	    if(!destFile.exists()) {
	        destFile.createNewFile();
	    }

	    FileChannel source = null;
	    FileChannel destination = null;

	    try {
	        source = new FileInputStream(sourceFile).getChannel();
	        destination = new FileOutputStream(destFile).getChannel();
	        destination.transferFrom(source, 0, source.size());
	    }
	    finally {
	        if(source != null) {
	            source.close();
	        }
	        if(destination != null) {
	            destination.close();
	        }
	    }
	}

	public static void main(String[] args) {
		//Option to search a user specified file from the application

	}

}

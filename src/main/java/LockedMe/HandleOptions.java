package LockedMe;


import java.io.File;
import java.util.ArrayList;


public class HandleOptions {
	
	public static Boolean checkIfExists(String file, File[] dir) {
		naiveStringMatching nsm = new naiveStringMatching();
		for (File f : dir) {
		if (naiveStringMatching.match(file, f.getName()) == true) { return true;};
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		//Option to search a user specified file from the application

	}

}

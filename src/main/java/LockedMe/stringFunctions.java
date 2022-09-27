package LockedMe;

import java.io.File;

public class stringFunctions {

	public static void main(String[] a) {
		String filename = a[0];
		File f1 = new File(filename);
		System.out.println("Name of the file = "+ f1.getName());
		System.out.println("Path of the file: "+ f1.getPath());
		System.out.println("absolute path of the file = "+ f1.getAbsolutePath());
		System.out.println("parent of the file = "+ f1.getParent());
		System.out.println("is file exists = "+ f1.exists());
		if (f1.exists()) {
			System.out.println("Is it writable? "+ f1.canWrite());
			System.out.println("is is readable ? = "+ f1.canRead());
			System.out.println("is it a directory ? "+ f1.isDirectory());
			System.out.println("file size in bytes is : "+ f1.length());
		}

	}

}

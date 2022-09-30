package LockedMe;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] string = {"src/main/java/lockedme/Main.java", "lara", "sam"};
		System.out.println("I like red pandas");
		naiveStringMatching.main(args);
		stringFunctions sf = new stringFunctions();
		sf.main(string);
		
		
		
		DisplayFilesDir dfd = new DisplayFilesDir();
		dfd.main(args);
		
		//Providing the full path for the directory  
		String path = System.getProperty("user.dir");  
		//creating a file object  
		File fObj = new File(path);  
		//creating on object of the class DisplayFileExample  
		DisplayFilesDir obj = new DisplayFilesDir(); 
		
	
		
		File [] currentDirectoryFiles = fObj.listFiles();
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter file name without quotes to check \n"
				+ "if it exists in current directory");
		String fileName = input.next();
		
		Boolean answer = HandleOptions.checkIfExists(fileName, currentDirectoryFiles);
		
		if (answer == true) {
			System.out.println("file "+ fileName+ " was found in current directory");
		}
		else {
			System.out.println("file "+ fileName+ " was not found in current directory\n"
					+ "please try to search again");
		}
		
	}

}

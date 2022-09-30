package LockedMe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		DisplayFilesDir dfd = new DisplayFilesDir(); // new displayfilesdir class object
		
		
		// initiating the app
		while(true) {
		
			// welcome message
			
			System.out.println("Hello! Welcome to our application " + "\uD83D\uDE01");
			System.out.println("Please choose what you would like to do :\n"
					+ "1. display files in this current directory\n"
					+ "2. additional options\n"
					+ "3. exit this application with a nice goodbye message\n");
			
			Scanner sc = new Scanner(System.in); //creating scanner object
			
			String input = sc.nextLine();  // new input from command line
			
			// different output for different choices- option 1
			if (input.equals("1")) {
				dfd.main(args);
				System.out.println("you will be shortly moved back to main menu..");
				TimeUnit.SECONDS.sleep(3); //for nicer flow
			}
			
			// option 2
			if (input.equals("2")) {
				System.out.println("please choose an option: \n"
						+ "1) to add a file to directory from another location\n "
						+ "2) to look for file in the current directory \n"
						+ "3) to delete a file from current directory \n"
						+ "4) go back to main menu \n");
				String input1 = sc.nextLine();
				
				if (input1.equals("1")) {
					System.out.println("Hi! to add a file please follow the following instructions:\n"
							+ "First, insert the path in computer from which the file should be copied\n"
							+ "for example: C:/users/rbbac/downloads/English_handbook_pdf_1.pdf \n"
							+ "please note that the exact \n"
							+ "path should be input, to ensure correct path please validate \n"
							+ "using file explorer in OS.");
					String input2 = sc.nextLine();
					Path source = Paths.get(input2);
					File userFile = source.toFile();
					
					System.out.println("Now, please write the name of the directory you \n"
							+ "would like to copy the file to, followed by the name\n"
							+ "of the file! this should be exact, for example : \n"
							+ "C:/users/rbbac/documents/English_handbook_pdf_1.pdf ");
					
					String input3 = sc.nextLine();
					Path target = Paths.get(input3);
					File targetFile = target.toFile();
					
					HandleOptions.copyFile(userFile, targetFile);
					
					System.out.println("File copied succesfuly! thank you for using the app\n"
							+ "you will now return to main menu in a moment.\n");
					TimeUnit.MILLISECONDS.sleep(150);
				}
					if(input1.equals("2")){
					String path = System.getProperty("user.dir"); //getting path of current directory
					
					File fobj = new File(path); // object file in current directory - not entirely understand this!
					
					File [] currentDirectoryFiles = fobj.listFiles(); // creating an array of files in directory
					
					System.out.println("please type the file you want to search for in current directory\n"
							+ "without quotes, for example : pom.xml ");
					String input4 = sc.nextLine();
					Boolean fileInFolder = HandleOptions.checkIfExists(input4,currentDirectoryFiles);
					if (fileInFolder){
						System.out.println("file "+input4+" was found in current directory!\n"
								+ "Thank you for using the app, you will now be returned to main menu..\n"
								+"\n"
								+"\n");
						TimeUnit.SECONDS.sleep(2);//for nicer flow
					}
					else {
						System.out.println("file "+input4+" was not found in current directory\n"
								+"Thank you for using the app, you will now be returned to main menu..\n"
								+"\n"
								+"\n");
						TimeUnit.SECONDS.sleep(2);//for nicer flow
					}
				}
				if (input1.equals("3")) {
					System.out.println("please follow the following instructions to delete a file:\n"
							+ "specify the file name and absolute path in computer, for example:\n"
							+ "C:/Users/rbbac/documents/english_handbook_pdf_1.pdf \n");
					String nameFileToDelete = sc.nextLine();
					File fileToDelete = new File(nameFileToDelete);
					if(	fileToDelete.delete()) {
						System.out.println("File was deleted successfuly! Thanks again for using my\n"
								+ "app! you will shortly be directed again to main menu");
						TimeUnit.MICROSECONDS.sleep(180);
					}else {
						System.out.println("File wasn't deleted successfuly. You will shortly be returned\n"
								+ "Try again please.");
					}
					
				}
				if (input1.equals("4")) {
					continue;
				}
			}
			// option 3
			if (input.equals("3")) {
				System.out.println("Bye bye, thank you very much and have a pleasant day.\n");
				break;
			}
		}
	}
}

//older version for reference
/*
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

*/
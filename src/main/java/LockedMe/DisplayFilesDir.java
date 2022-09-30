package LockedMe;

import java.io.File;
import java.util.ArrayList;  
public class DisplayFilesDir
	{  
		public void printFileNames(File[] a, int i, int lvl)  
			{  
				//base case of the recursion  
				//i == a.length means the directory has   
				//no more files. Hence, the recursion has to stop  
				if(i == a.length)  
					{  
						return;  
						}  
				//checking if the encountered object is a file or not  
				if(a[i].isFile())  
					{  
						System.out.println(a[i].getName());  
					}  
					//recursively printing files from the directory  
					//i + 1 means look for the next file  
				printFileNames(a, i + 1, lvl);  
				}  
			//Main Method  
			public static void main(String[] argvs)  
			{  
				//Providing the full path for the directory  
				String path = System.getProperty("user.dir");  
				//creating a file object  
				File fObj = new File(path);  
				//creating on object of the class DisplayFileExample  
				DisplayFilesDir obj = new DisplayFilesDir();  
				if(fObj.exists() && fObj.isDirectory())  
				{  
					//array for the files of the directory pointed by fObj  
					File a[] = fObj.listFiles();  
					//display statements  
						System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");  
						System.out.println("Displaying Files from the directory : " + fObj);  
						System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");  
						//Calling the method  
						obj.printFileNames(a, 0, 0);  
				}  
			}  
			
		public ArrayList<String> listFileNames(File[] a, int i, int lvl) {
			ArrayList<String> filesList = new ArrayList<String>();
			if(i== a.length) {
				return filesList;
			}
			
			if (a[i].isFile()) {
				filesList.add(a[i].getName());
			}
			return listFileNames(a,i+1,lvl);
			
			
		}
		}  
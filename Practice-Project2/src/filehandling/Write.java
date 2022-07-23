package filehandling;

import java.util.Scanner;
import java.io.*;

	public class Write {
	   public static void main(String[] args)
	   {
	      String myfile, content;
	      try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the Name of File: ");
			  myfile = scan.nextLine();
			  
			  try
			  {
			     FileWriter fw = new FileWriter(myfile);
			     System.out.print("\nEnter the Content: ");
			     content = scan.nextLine();
			     fw.write(content);
			     fw.close();
			     System.out.println("\nContent written to the file successfully.");
			  }
			  catch(IOException ioe)
			  {
			     System.out.println("\nException: " +ioe);
			  }
		}
	   }
	}

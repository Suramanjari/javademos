package filehandling;

import java.util.Scanner;
import java.io.*;

	public class Read {
	   public static void main(String[] args)
	   {
	      String myfile, myline;
	      try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter File Name: ");
			  myfile = scan.nextLine();
		}
	      
	      try
	      {
	         FileReader fileReader = new FileReader(myfile);
	         BufferedReader bufread = new BufferedReader(fileReader);

	         while((myline = bufread.readLine()) != null)
	            System.out.println(myline);
	         
	         bufread.close();
	      }
	      catch(IOException e)
	      {
	         System.out.println("Exception: " +e);
	      }
	   }
	}

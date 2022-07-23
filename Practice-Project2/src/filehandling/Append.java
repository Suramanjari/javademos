package filehandling;
import java.io.*;
import java.util.Scanner;

	public class Append {
	
	public static void main(String[] args)
	{
	 String filename, line="", content="";
	 char ch;
	 int totLine, i;
     try (Scanner scan = new Scanner(System.in)) {
		System.out.print("Enter the Name of File: ");
		filename = scan.nextLine();
					  
	while(true)
	 {
	try
	 {
	  FileReader fr = new FileReader(filename);
	  BufferedReader br = new BufferedReader(fr);
	  System.out.println("\nContent of File");
	while((line = br.readLine()) != null)
	 {
	  System.out.println(line);
	 }
	  br.close();
	  System.out.print("\nWant to append the text (yes/no) ? ");
	  ch = scan.next().charAt(0);
	if(ch=='y')
	{
	  System.out.println("\n1. Append Single Line of Text.");
	  System.out.println("2. Append Multiple Line of Text.");
	  System.out.print("Enter Your Choice (1 or 2): ");
	  ch = scan.next().charAt(0);
	if(ch=='1')
	{
	  try (Scanner s = new Scanner(System.in)) {
		System.out.print("\nEnter the Text: ");
		  line = s.nextLine();
	}
	  try
	 {
	  FileWriter fw = new FileWriter(filename, true);
	  fw.write("\n");
	  fw.write(line);
	  fw.close();
	  System.out.println("\nThe content is successfully appended to the file.");
	 }
	catch(IOException ioe)
	 {
	  System.out.print("\nSomething went wrong!");
	 }
	}
	else if(ch=='2')
	{
	 try (Scanner s = new Scanner(System.in)) {
		System.out.print("\nHow many lines to write ? ");
		 totLine = s.nextInt();
		 System.out.print("Enter " +totLine+ " lines of text: ");
		 for(i=0; i<(totLine+1); i++)
		  {
		   line = s.nextLine();
		   if((i+1)<(totLine+1))
		   line = line + '\n';
		   content = content + line;
		  }
	}
	 try
	 {
	  FileWriter fw = new FileWriter(filename, true);
	  fw.write(content);
	  fw.close();
	  System.out.println("\nThe content is successfully appended to the file.");
     }
	catch(IOException ioe)
	 {
	  System.out.print("\nSomething went wrong!");
	 }
	}
	else
	 {
	  System.out.println("\nInvaid Choice!");
	  break;
	 }
	  System.out.print("\nWant to see the new content (yes/no) ? ");
	  ch = scan.next().charAt(0);
	if(ch!='y')
	   break;
	 }
	else
	 {
	  break;
	 }
	}
	  catch(IOException ioe)
	   {
		System.out.println("\nFile Not Found!");
	   }
	}
   }
  }
}

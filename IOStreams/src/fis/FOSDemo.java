package fis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
	
public static void main(String[] args) {
		
		File myfile = new File("F:\\Sura\\MPHASIS");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(myfile);
			System.out.println("File successfully opened");
			String data = "hello java";
			fos.write(data.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File closed");
		}
		
		
	}

}

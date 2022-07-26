package readerwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	
	public static void main(String[] args) throws IOException {
	
	FileReader fr = new FileReader("F:\\Sura\\MPHASIS\\note\\hello.txt");
	FileWriter fw = new FileWriter("F:\\Sura\\MPHASIS\\note\\hai.txt");
	
	int ch;
	while ((ch = fr.read()) != -1) {
		fw.write(ch);
	}
	
	fr.close();
	fw.close();
		
	}
	

}

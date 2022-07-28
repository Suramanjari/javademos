package bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferReaderDemo {
	
		public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("F:\\\\Sura\\\\MPHASIS\\\\note\\\\hello.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int count = 0;
		while ( (line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			count += st.countTokens();
		}
		br.close();
		fr.close();
		
		System.out.println("count of words in the file = " + count);
	}
}
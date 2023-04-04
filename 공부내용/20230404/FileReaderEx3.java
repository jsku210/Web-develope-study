package src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx3 {
	public static void main(String[] args) throws IOException {
		Reader r = new FileReader("C:/Temp/test.txt");
		int rNo;
		char[] rchar = new char[5];
		rNo = r.read(rchar,1,4);
		for(int i =0; i<rchar.length;i++) {
			System.out.print(rchar[i]);
		}
	}
}

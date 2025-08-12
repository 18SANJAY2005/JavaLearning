package File_Handling_Programs;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_In_Data {
	public static void main(String[] args) throws IOException {
		File f1 = new File("xyz.txt");
		FileReader fr = new FileReader(f1);
		//int res = fr.read();
		//System.out.println(res);
		//System.out.println((char)res);
		String res="";
		int ch=fr.read();
		while(ch!=-1)
		{
			res+=(char)ch;
			ch=fr.read();
		}
		System.out.println(res);
		fr.close();
	}
}

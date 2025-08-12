package File_Handling_Programs;

import java.io.File;
import java.io.IOException;

public class Program_2 {
	public static void main(String[] args) throws IOException {
		//String path = "C:\\My_Folder\\santhosh/xyz.pdf";
		//String path = "xyz.pdf";
		//String path1 = "C:\\My_Folder\\santhosh/xyz.txt";
		String path1 = "xyz.txt";
		//File f = new File(path);
		File f1 = new File(path1);
		f1.createNewFile();
		if (f1.createNewFile()) {
			System.out.println("file is created");
		} else {
			System.out.println("file is already exits");
		}
	}
}

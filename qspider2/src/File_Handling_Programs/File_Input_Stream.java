package File_Handling_Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Input_Stream {
	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\Lenovo\\Downloads";
		String destination = "C:\\My_Folder\\santhosh/"; // my files are in protection 
		File f1 = new File(source);
		File f2 = new File(destination);
		FileInputStream fi = new FileInputStream(f1);
		FileOutputStream fo = new FileOutputStream(f2);
		int data = fi.read();
		while (data != -1) {
			fo.write(data);
			data = fi.read();
		}
		System.out.println("done");
		fi.close();
		fo.close();
	}
}

package File_Handling_Programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_In_Data {
	public static void main(String[] args) throws IOException {
		File f1 = new File("xyz.txt");
		FileWriter fw = new FileWriter(f1, true);
		String s = "hi";
		fw.write(s);
		System.out.println("Done");
		fw.close();

	}
}

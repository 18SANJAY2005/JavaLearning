package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
     public static void main(String[] args) throws IOException {
		File f1 = new File("E:\\sanjay/abc.txt");
		
		
		FileWriter fw = new FileWriter(f1,true);
		
		String s = "sanjay";
		fw.write(s);
		System.out.println("Done");
		fw.close();
	}
}

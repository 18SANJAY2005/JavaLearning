package File_Handling_Programs;

import java.io.File;

public class Program_4 {
	public static void main(String[] args) {
		String oldFolder = "C:\\My_Folder\\santhosh";
		String newFolder = "C:\\\\My_Folder\\\\santhosh";
		File f1 = new File(oldFolder);
		File f2 = new File(newFolder);
		if (f1.renameTo(f2)) {
			System.out.println("Done");
		} else {
			System.out.println("Error");
		}
	}
}
 
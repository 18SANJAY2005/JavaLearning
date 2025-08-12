package File_Handling_Programs;

import java.io.File;

public class program_1 {
	public static void main(String[] args) {
		//String path = "C:\\My_Folder/santhosh";
		String path ="santhosh";
		File f1 = new File(path);
		if (f1.mkdir()) {
			System.out.println("folder is created");
		} else {
			System.out.println("folder is exits");
		}

	}
}

package File_Handling_Programs;

import java.io.File;

public class Program_3 {
	public static void main(String[] args) {
		//String path = "C:\\My_Folder\\santhosh";
		String path = "santhosh";

		File f = new File(path);
		if (f.delete()) {
			System.out.println("file is deleted");
		} else {
			System.out.println("file is not deleted");
		}
	}
	// if we want to use delete,first we want to delete files after that folder will be deleted 
}

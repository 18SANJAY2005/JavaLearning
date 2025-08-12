package File_Handling_Programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Storing_Object {
	public static void main(String[] args) throws IOException {
		//String s1 = "Hello";
		File f1 = new File("xyz.txt");
		FileOutputStream fo = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		Student s1=new Student(28, "Vimal", 1, "Vimal Raj");
		oos.writeObject(s1);
		System.out.println("Done");
		fo.close();
		oos.close();
	}
}

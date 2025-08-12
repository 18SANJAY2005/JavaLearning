package File_Handling_Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Reading_Object {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f1 = new File("xyz.txt");
		FileInputStream fi = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fi);
		Object o = ois.readObject();
		//String ress = (String) o;
		Student res = (Student) o;
		
		System.out.println(res);
		fi.close();
		ois.close();
	}
}

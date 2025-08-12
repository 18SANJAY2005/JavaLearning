package FileHandling;

import java.io.File;
import java.io.IOException;

public class Program1 {
              public static void main(String[] args) throws IOException {
				String oldPath = "E:\\newfolder";
				String newPath = "E:\\newfoldersanjay";
				File f1 = new File(oldPath);
				File f2 = new File(newPath);
				
				if(f1.renameTo(f2)) {
					System.out.println("Done");
				}else {
					System.out.println("Not");
				}
				


			}
}

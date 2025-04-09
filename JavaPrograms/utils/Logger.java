package utils;

import java.io.FileWriter;
import java.io.IOException;


public class Logger {
	public void write(String str) {
		try{
			FileWriter fs = new FileWriter("console.log",true);
			fs.append(str);
			fs.close();
         }catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
}


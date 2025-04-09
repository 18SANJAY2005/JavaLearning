package CollectionProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program7 {
     public static void main(String[] args) {
		String[]arr= {"ABC","BCD","XYZ"};
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(i,arr[i]);
		}
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" : " + entry.getValue());
		}
	}
}

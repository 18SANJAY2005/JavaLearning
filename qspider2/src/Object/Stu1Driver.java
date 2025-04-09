package Object;

import java.util.Arrays;
import java.util.Comparator;

public class Stu1Driver {
      public static void main(String[] args) {
		Student1 s1 = new Student1(18, 70, "asd");
		Student1 s2 = new Student1(22, 100, "zxc");
		Student1 s3 = new Student1(20, 65, "qwe");
		Comparator c = new Namecomparator();
		Comparator c1 = new AgeComparator();
		Student1[]arr = {s1,s2,s3};
		Arrays.sort(arr,c);
		Arrays.sort(arr,c1);
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));
	}
}

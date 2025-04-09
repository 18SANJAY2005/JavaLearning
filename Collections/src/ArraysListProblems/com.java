package ArraysListProblems;

import java.util.Comparator;

public class com implements Comparator<Integer> {
public static int sum(int a) {
		int b=0;
		int res=0;
		while(a>0) {
		b=a%10;
		a=a/10;
		res+=b;
		}
		return(res);
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(sum(o1)==sum(o2))
			return 0;
		if(sum(o1)>sum(o2))
			return 1;
		return -1;
	}

}

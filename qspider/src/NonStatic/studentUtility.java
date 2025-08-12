package NonStatic;

public class studentUtility {
	public static void calcMarks(int[] mark) {
		int sum = 0;
		for (int a : mark) {
			sum += a;
			System.out.println("Total Marks:" + sum);
            calcAvg(sum,mark);
		}

	}
	public static void calcAvg(int sum,int[]mark) {
		double Avg = sum/mark.length;
		System.out.println("Avg:" + Avg);
	}
 }

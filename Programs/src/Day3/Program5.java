package Day3;

public class Program5 {
	public static void main(String[] args) {

		int[] arr = { 1, -2, 3, 4 };
		System.out.println(getMax(arr));
	}

	public static int getMax(int[] arr)

	{
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++)

			{
				int sum = addElements(arr, i, j);
				if (sum > max)
					max = sum;
			}
		}

		return max;

	}

	public static int addElements(int[] arr, int s, int e)

	{

		int sum = 0;
        for (int i = s; i <= e; i++)

		{
        	sum += arr[i];

		}

		return sum;

	}

}

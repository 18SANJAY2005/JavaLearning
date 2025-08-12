package Day3;

public class Program6 {
	public static void main(String[] args) {

		int[] arr = { 1, -2, 3, 4 };
		System.out.println(getMax(arr, 0));
	}

	public static boolean getMax(int[] arr,int sum)

	{
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++)

			{
				int temp = addElements(arr, i, j);
				if (sum==temp)
					return true;
			}
		}

		return false;

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

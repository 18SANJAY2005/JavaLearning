package Array2d;




public class Transpose {
	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4}};
		//int[][] arr1 = {{1,2},{3,4}};
		transpose(arr);
		
	}
	public static void transpose(int[][]arr) {
		int[][] res = new int[arr[0].length][arr.length];
		
		for(int i =0;i<res.length;i++) {
			for(int j =0;j<res[i].length;j++) {
				res[i][j]=arr[j][i];
				System.out.print(res[i][j] + " ");
				
				
				
			}
			System.out.println();
		}
		

	
	}


}

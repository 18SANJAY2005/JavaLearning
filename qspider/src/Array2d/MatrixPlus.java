package Array2d;




public class MatrixPlus {
	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4}};
		int[][] arr1 = {{1,2},{3,4}};
		mat1(arr,arr1);
		
	}
	public static void mat1(int[][]arr,int[][]arr1) {
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				arr[i][j]=arr[i][j] + arr1[i][j];
				System.out.print(arr[i][j] + " ");
				
				
			}
			System.out.println();
		}
		
	
	}


}

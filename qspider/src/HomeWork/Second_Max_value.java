package HomeWork;

public class Second_Max_value {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>max)
            {
                max2=max;
                max=arr[i];
            } else if (arr[i]>max&& arr[i]<max2) {
                max2=arr[i];
            }
        }
        System.out.println("The second greatest value in the array is "+max2);
    }
}

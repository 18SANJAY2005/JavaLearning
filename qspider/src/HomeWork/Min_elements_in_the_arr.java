package HomeWork;
public class Min_elements_in_the_arr {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++)   {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("The min value in the array is "+min);
    }
}

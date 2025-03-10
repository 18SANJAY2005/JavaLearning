package HomeWork;
import java.util.Arrays;
public class Swap_odd_with_next_even {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        for (int i = 1; i <arr.length-1; i++) {
            if(i%2!=0)
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

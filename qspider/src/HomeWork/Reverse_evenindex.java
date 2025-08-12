package HomeWork;
import java.util.Arrays;
public class Reverse_evenindex {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int size= arr.length;
        int left=0,right=size-1;
        while(left<right)
        {
            if(left%2!=0)
                left++;
            if (right%2!=0)
                right--;
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left+=2;
            right-=2;
        }
        System.out.println("Revering the even index :");
        System.out.println(Arrays.toString(arr));
    }
}

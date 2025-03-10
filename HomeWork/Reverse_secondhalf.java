package HomeWork;
import java.util.Arrays;
public class Reverse_secondhalf {
    public static void main(String[] args)
    {
        int[] arr=Inputarr.input();
        int[] arr1=new int[arr.length];
        int size= arr.length-1;
        for (int i = 0; i < arr.length; i++)
        {
            if(i< arr.length/2)
            {
                arr1[i]=arr[i];
            }
            else
            {
                arr1[size--]=arr[i];
            }
        }
        System.out.println("The last half reverse :");
        System.out.println(Arrays.toString(arr1));
    }
}

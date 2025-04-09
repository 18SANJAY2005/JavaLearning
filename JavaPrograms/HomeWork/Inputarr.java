package HomeWork;
import java.util.*;
public class Inputarr
{
    public static int[] input() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size =sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter "+size+" elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        return arr;
    }
}

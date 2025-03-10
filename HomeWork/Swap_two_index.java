package HomeWork;
import java.util.Arrays;
import java.util.Scanner;
public class Swap_two_index {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the indexes to swap:");
        int i1= sc.nextInt();
        int i2= sc.nextInt();
        sc.close();
        System.out.println("before index swap : ");
        System.out.println(Arrays.toString(arr));
        int temp=0;
        temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
        System.out.println("After the index swap :");
        System.out.println(Arrays.toString(arr));
    }
}

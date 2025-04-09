package HomeWork;
import java.util.Scanner;
public class Index_of_ele {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to search");
        int num=sc.nextInt();
        int res=find(arr,num);
        System.out.println(res==0?"The element is not their in the array ":"The index is "+res);
    }
    public static int find(int[] arr,int num)
    {
        for (int i = 0; i < arr.length; i++)
        {
         if (arr[i]==num)
            return i;
        }
        return 0;
    }
}

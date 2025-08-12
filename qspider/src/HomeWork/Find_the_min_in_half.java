package HomeWork;
public class Find_the_min_in_half
{
    public static void main(String[] args)
    {
        int[] arr=Inputarr.input();
        int min=Integer.MAX_VALUE;
        int n= arr.length;
        for (int i = n/2; i < arr.length ; i++) {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("The min in the last half is "+min);
        }
}

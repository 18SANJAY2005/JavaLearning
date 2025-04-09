package HomeWork;
public class Read_secondhalf_reverse
{
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int n= arr.length-1;
        System.out.println("The second half of element in reverse :");
        for (int i = n; i >=n/2 ; i--) {
            System.out.println(arr[i]);
        }
    }
}

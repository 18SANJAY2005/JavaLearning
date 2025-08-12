package HomeWork;
public class Read_firsthalf_reverse {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int n= arr.length-1;
        System.out.println("The first half from reverse");
        for(int i=n/2;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}

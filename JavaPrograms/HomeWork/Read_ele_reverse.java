package HomeWork;

public class Read_ele_reverse {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int n= arr.length-1;
        System.out.println("The array in reverse order : ");
        for (int i = n; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }
}

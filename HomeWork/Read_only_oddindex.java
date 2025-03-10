package HomeWork;
public class Read_only_oddindex {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        System.out.println("The array elements in odd postion:");
        for (int i = 0; i < arr.length; i++) {
            if (i%2!=0)
            System.out.println(arr[i]);
        }
    }
}

package HomeWork;

public class Read_even_reverse {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int n= arr.length-1;
        System.out.println("the even element int the array in reverse order :");
        for (int i = n; i >=0 ; i--) {
            if(i%2==0)
                System.out.println(arr[i]);
        }
    }
}

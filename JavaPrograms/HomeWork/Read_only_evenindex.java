package HomeWork;

public class Read_only_evenindex {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        System.out.println("Read only the even index elements:");
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0)
                System.out.println(arr[i]);
        }
    }
}

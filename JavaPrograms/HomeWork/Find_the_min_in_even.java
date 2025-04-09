package HomeWork;

public class Find_the_min_in_even {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0)
            {
                if(arr[i]<min)
                    min=arr[i];
            }
        }
        System.out.println("The min in the even index "+min);
    }
}

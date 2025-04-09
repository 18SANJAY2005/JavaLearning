package HomeWork;

public class Find_the_max_in_odd {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0)
            {
                if(arr[i]>max)
                    max=arr[i];
            }
        }
        System.out.println("The max in the odd index "+max);
    }
}

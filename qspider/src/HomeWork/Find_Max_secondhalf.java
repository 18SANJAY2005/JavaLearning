package HomeWork;

public class Find_Max_secondhalf {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i = n/2; i <n ; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("The max in the second half "+max);
    }
}

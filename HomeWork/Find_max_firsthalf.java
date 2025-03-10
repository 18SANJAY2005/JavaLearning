package HomeWork;

public class Find_max_firsthalf {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <=arr.length/2; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("The max in the first half is "+max);
    }
}

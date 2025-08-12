package HomeWork;
public class Min_of_firsthalf {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <=arr.length/2; i++) {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("The min in the first half is "+min);
    }
}

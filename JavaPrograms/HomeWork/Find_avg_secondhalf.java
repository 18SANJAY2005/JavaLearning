package HomeWork;
public class Find_avg_secondhalf {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int n= arr.length;
        int sum=0;
        for (int i = n/2; i <n ; i++) {
            sum+=arr[i];
        }
        System.out.println("The avg of second half "+sum/(n/2));
    }
}

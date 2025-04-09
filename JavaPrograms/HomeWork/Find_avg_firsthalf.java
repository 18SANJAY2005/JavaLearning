package HomeWork;
public class Find_avg_firsthalf {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int sum=0,n= arr.length;
        for (int i = 0; i <=n/2; i++) {
            sum+=i;
        }
        System.out.println("The avg of the first half "+sum/(n/2));
    }
}

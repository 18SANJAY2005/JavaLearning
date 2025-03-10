package HomeWork;
public class Average_array {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int sum=0;
        double avg=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        avg=sum/ arr.length;
        System.out.println("The average of the array "+avg);
    }
}

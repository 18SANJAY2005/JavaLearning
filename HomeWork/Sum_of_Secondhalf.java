package HomeWork;
public class Sum_of_Secondhalf {
    public static void main(String[] args) {
        int[] arr = Inputarr.input();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= arr.length / 2)
                sum += arr[i];
        }
        System.out.println("The sum of the first half " + sum);
    }
}

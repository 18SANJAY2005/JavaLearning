package HomeWork;
public class Sum_of_all_elements {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("The sum of all the elements in the array is "+sum);
    }
}

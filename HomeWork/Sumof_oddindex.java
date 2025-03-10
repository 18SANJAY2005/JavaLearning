package HomeWork;

public class Sumof_oddindex {
    public static void main(String[] args) {
        int[] arr=Inputarr.input();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0)
                sum+=arr[i];
        }
        System.out.println("The sum of the odd index in the array is "+sum);
    }
}

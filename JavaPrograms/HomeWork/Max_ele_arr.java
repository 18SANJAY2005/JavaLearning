package HomeWork;
public class Max_ele_arr {
    public static void main(String[] args) {
        int arr[]=Inputarr.input();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i])
                max=arr[i];
        }
        System.out.println("The max in the array is "+max);
    }
}

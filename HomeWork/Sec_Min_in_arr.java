package HomeWork;
public class Sec_Min_in_arr {
    public static void main(String[] args) {
        int arr[]=Inputarr.input();
        int min=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i]<min)
                {
                    min2=min;
                    min=arr[i];
                } else if (arr[i]>min && arr[i]<min2) {
                    min2=arr[i];
                }
        }
        System.out.println("The second smallest in the array is "+min2);
    }
}

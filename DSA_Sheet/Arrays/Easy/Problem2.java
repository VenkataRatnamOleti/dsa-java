import java.util.Arrays;
public class Problem2 {

    public static void reverse(int[] arr){
        int l=0,r=arr.length-1;
        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

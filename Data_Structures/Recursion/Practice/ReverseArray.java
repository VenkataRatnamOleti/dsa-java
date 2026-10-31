// package Recursion.Practice;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        printArr(arr);
        reverse(arr,0,arr.length-1);
        printArr(arr);
    }

    public static void reverse(int[] arr, int l, int r){
        if(l>r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr,++l,--r);
    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

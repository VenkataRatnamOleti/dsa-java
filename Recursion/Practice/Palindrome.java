// package Recursion.Practice;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {3};
        printArr(arr);
        System.out.println("Is Array is Palindrome : " + isPalindrome(arr,0,arr.length-1));
    }

    public static boolean isPalindrome(int[] arr, int l, int r){
        if(l>r) return true;
        if(arr[l] != arr[r]) return false;
        return isPalindrome(arr, ++l, --r);
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

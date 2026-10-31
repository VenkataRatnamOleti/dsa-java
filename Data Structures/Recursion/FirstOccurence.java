package Recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,4,9,0,3,9};
        System.out.println(firstOccurence(arr, 0, 9));
        System.out.println(lastOccurence(arr, 0, 9));
    }

    public static int firstOccurence(int[] arr, int i, int key){
        if(i == arr.length) return -1;
        if(arr[i] == key) return i;

        return firstOccurence(arr, i+1, key);
    }

    public static int lastOccurence(int[] arr, int i, int key){
        if(i == arr.length) return -1;

        int isFound = lastOccurence(arr, i+1, key);
        if(isFound == -1 && arr[i] == key) return i;

        return isFound;
    }
}

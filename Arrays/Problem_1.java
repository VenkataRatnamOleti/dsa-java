//An integer array numbers, return true if any value appears twice in the array otherwise false:

//Brute force approach: O(n^2)

import java.util.*;

public class Problem_1{
    public static boolean duplicate(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean duplicateOptimized(int arr[]){
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<arr.length-1;i++){
            if(set.contains(arr[i])){
                return true;
            } else {
                set.add(arr[i]);
            }
        }

        return false;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        System.out.println("Is it contain Duplicates: " + duplicateOptimized(arr));
    }
}
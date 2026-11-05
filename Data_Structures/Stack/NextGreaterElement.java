import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    // Brute force 
    public static int[] getNextGreaterArray(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            boolean isFound = false;
            for(int j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    res[i] = arr[j];
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                res[i] = -1;
            }
        }
        return res;
    }

    // Optimal Approach
    public static int[] nextGreaterElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        // int[] arr = {6,8,0,1,3};
        int[] arr = {8,0,1,9,6,2,4,7};
        // System.out.println(Arrays.toString(getNextGreaterArray(arr)));
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }
}

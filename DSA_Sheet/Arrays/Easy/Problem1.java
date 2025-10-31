public class Problem1 {

    public static void minArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        System.out.println("Minimum is " + min);
    }

    public static void maxArray(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println("Maximum is " + max);
    }

    public static void main(String[] args) {
        int[] arr = {6,1,9,2,5,1,8,3,7,4,9};

        minArray(arr);
        maxArray(arr);
    }
}

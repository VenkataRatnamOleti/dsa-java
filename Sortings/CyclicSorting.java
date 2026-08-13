public class CyclicSorting {
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Calculate the correct target index for the current value
            int correctIndex = arr[i] - 1; 
            
            // If the element is not at its correct position, swap it
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                // Move forward only when the current index holds the correct item
                i++; 
            }
            printArr(arr);
        }
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        printArr(arr);
        cyclicSort(arr);
        printArr(arr);
    }
}

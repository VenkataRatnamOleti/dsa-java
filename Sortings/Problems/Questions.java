public class Questions {

    public static void bubbleSort(int[] arr){
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev >=0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j=0;
        for (int i = count.length-1; i >=0; i--) {
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }    
        System.out.println();
    }




    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        printArr(arr);
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        printArr(arr);
    }
}

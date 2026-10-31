public class selectionSorting{
    
    public static void selectionSort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            int min = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[min] > nums[j]){
                    min = j;
                }
            }

            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;

        }
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
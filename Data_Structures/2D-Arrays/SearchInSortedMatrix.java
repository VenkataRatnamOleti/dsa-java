public class SearchInSortedMatrix {

    public static void search(int[][] matrix, int target){

        // Brute Force (Time Complexity [O(n^2)])
        /* 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(target == matrix[i][j]){
                    System.out.println("Element found at i,j : " + i + ',' + j);
                    return;
                }
            }
        }
        */

        // Average (Time Complexity [O(nlogn)])
        
        for (int i = 0; i < matrix.length; i++) {
            int index = binarySearch(matrix[i], 0, matrix[i].length-1, target);

            if(index != -1){
                System.out.println("Element found at i,j : " + i + ',' + index);
                return;
            }
        }



        System.out.println("Element Not found!");

    }

    public static int binarySearch(int[] arr, int l, int r, int target){
        int mid = (l+r)/2;

        if(l<=r){     
            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                return binarySearch(arr, l, mid-1, target);
            }else{
                return binarySearch(arr, mid+1, r, target);
            }
        }

        return -1;
    }

    // Best Case Time Complexity O(n)

    public static void stairCase(int[][] matrix, int target){
        int row = 0, col = matrix[0].length-1;

        // while(row<matrix.length && col>=0){
        //     if(matrix[row][col] == target){
        //         System.out.println("Element found at i,j : " + row + ',' + col);
        //         return;
        //     }else if(target < matrix[row][col]){
        //         col--;
        //     }else{
        //         row++;
        //     }
        // }

        //H.W.

        row = matrix.length-1;
        col = 0;

        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col] == target){
                System.out.println("element found at i,j : " + row + ',' + col);
                return;
            } else if(matrix[row][col]<target){
                row--;
            } else {
                col++;
            }
        }



        System.out.println("Element Not found!");
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        search(matrix, 45);

        stairCase(matrix, 45);

    }
}

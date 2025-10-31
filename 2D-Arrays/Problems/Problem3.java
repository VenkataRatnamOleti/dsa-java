public class Problem3 {

    // 2X2 -> 1 swap
    // 3X3 -> 3 swap
    // 4X4 -> 5 swap
    // 5X5 -> 7 swap

    // 1X2 -> 1 extra
    // 2X3 -> 1 swap + 1 extra
    // 2X4 -> 
    public static int[][] secondRowSum(int matrix[][]){
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        return transpose;
    }

    public static void printMat(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};

        printMat(matrix);
        printMat(secondRowSum(matrix));
    }
}

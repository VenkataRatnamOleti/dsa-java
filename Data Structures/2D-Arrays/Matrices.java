import java.util.Scanner;

public class Matrices {
    public static void printMat(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void searchMatrix(int[][] matrix, int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("Key found at index : (" + i + "," + j + ")");
                    return;
                }
            }
        }

        System.out.println("Key not found!");
    }

    public static int largestMatrix(int[][] matrix){
        int largest = Integer.MIN_VALUE;
        boolean flag = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                    flag = true;
                }
            }
        }

        if(flag) return largest;
        else return -1;
    }

    public static int smallestMatrix(int[][] matrix){
        int smallest = Integer.MAX_VALUE;
        boolean flag = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                    flag = true;
                }
            }
        }

        if(flag) return smallest;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printMat(matrix);
        searchMatrix(matrix,4);

        System.out.println("Largest is " + largestMatrix(matrix));
        System.out.println("Smallest is " + smallestMatrix(matrix));

        sc.close();
    }
}

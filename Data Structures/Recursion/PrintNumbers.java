package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers(20);
    }

    public static void printNumbers(int n){
        if(n>=1){
            System.out.print(n +" ");
            printNumbers(n-1);
        }
    }
}

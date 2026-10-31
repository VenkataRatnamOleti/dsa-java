package Recursion;

public class PrintNumbersDesc {
    public static void main(String[] args) {
        printNumbers(10);
    }

    public static void printNumbers(int n){
        if(n == 1){
            System.out.println(1);
            return ;
        }
        printNumbers(n-1);
        System.out.println(n);
    }
}

package Recursion;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        System.out.println(sumOfNNaturalNums(10));
    }

    public static int sumOfNNaturalNums(int n){
        if(n == 1) return n;
        return n+sumOfNNaturalNums(n-1);
    }
}

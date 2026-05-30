import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // It can be Optimized again. (Check?)
        if(n%15 == 0) System.out.println("FizzBuzz");
        else if(n%3 == 0) System.out.println("Fizz");
        else if(n%5 == 0) System.out.println("Buzz");
        else System.out.println(n);

        // This is an Example of Contructive Algorithm question.
        // Coding contest first 2 or 3 questions are given Constructive algorithms.
    }
}

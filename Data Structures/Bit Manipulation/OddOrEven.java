import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if((n&1)==1)System.out.println("Odd");
        else System.out.println("Even");
        sc.close();
    }
}

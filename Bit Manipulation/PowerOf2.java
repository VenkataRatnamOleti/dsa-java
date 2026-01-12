import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(powerOf2(n)) System.out.println("It is Power of 2");
        else System.out.println("It is not Power of 2");
        sc.close();
    }

    public static boolean powerOf2(int n){
        return (n&(n-1))==0;
    }
}

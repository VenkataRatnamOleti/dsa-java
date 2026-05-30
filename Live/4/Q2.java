import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        if(temperature >= 103.5) System.out.println("Fever");
        else System.out.println("All Good");

        // Ternary Operator is used when we assign some values to the variable.
        // Ternary Operator is not recommended to used with print statements.
        sc.close();

    }
}
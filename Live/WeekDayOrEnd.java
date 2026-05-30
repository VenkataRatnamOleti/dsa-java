import java.util.Scanner;

public class WeekDayOrEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 1: {}
            case 2: {}
            case 3: {}
            case 4: {}
            case 5: {
                System.out.println("WeekDay"); 
                break;                                      // One More Optimization (need java 17+) [case 1,2,3,4,5: System.out.println("WeekDay");]
            }
            case 6: {}
            case 7: {
                System.out.println("WeekEnd");
                break;
            }
            default: System.out.println("Invalid Day");
        }
    }
}

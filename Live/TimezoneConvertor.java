import java.util.Scanner;

public class TimezoneConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        hour += 5;
        minute += 30;

        // Databases works in 24 hour format

        // OOPS is low level design (LLD)
        if(minute >=60){
            hour++;
            minute -= 60;
        }
        if(hour >= 24){
            day++;
            hour -= 24;
        }
        System.out.println(day+" "+hour+" "+minute);
        sc.close();
    }
}

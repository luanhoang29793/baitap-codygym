package languageJava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class test_leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year: ");
        int year = scanner.nextInt();
        boolean check = true;
        if (year % 4 == 0 && year % 100 != 0) {
            check = true;
        } else if (year % 100 == 0 && year % 400 != 0) {
            check = false;
        } else if (year % 100 == 0 && year % 400 == 0) {
            check = true;
        } else
            check = false;
        if (check)
            System.out.println("Year " + year + " is leap year");
        else
            System.out.println("Year "+ year + " is not leap year");

    }
}

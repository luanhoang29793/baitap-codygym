package languageJava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class display_Prime_letter_100 {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100 la: ");
        int dem = 0;
        for (int i =2; i <=100 ; i++)
        {
            if (test_Prime(i) == 1)
            {
                System.out.print(+i+ " ");
            }
        }
    }
    public  static  int test_Prime (int number) {
        int i = 2;
        int check = 1;
        while ((i <= Math.sqrt(number))) {
            if (number % i == 0) {
                check = 0;
            }
            i++;
        }
        return check;
    }
}

package languageJava;

import java.util.Scanner;

public class display_20_first {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhaap do dai chuoi: ");
        int number = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count < number) {
            if (test_Prime(i) == 1) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static int test_Prime(int number) {
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


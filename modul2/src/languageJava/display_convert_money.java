package languageJava;

import java.util.Scanner;

public class display_convert_money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int rate;
        rate = 23000;
        System.out.println(" Menu ");
        System.out.println(" 1. Convert from USD to VND");
        System.out.println(" 2. Convert from VND to USD");
        System.out.println("0. Exit");

        System.out.println("Nhap gia tri: ");
        int number = scanner.nextInt();
        System.out.println(" Enter  your choice: ");
        choice = scanner.nextInt();
        while (choice !=0) {


            switch (choice) {
                case 1:

                    System.out.println(number + "USD" + " thanh " + number * rate + "VND");
                    break;
                case 2:
                    System.out.println(number + "VND" + " thanh " + number/rate + "USD");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
            System.out.println("Nhap gia tri: ");
            number = scanner.nextInt();
            System.out.println(" Enter  your choice: ");
            choice = scanner.nextInt();
        }
    }
}

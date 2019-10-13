package array_method_java;

import java.util.Scanner;

public class convert_temperature {
    public static double fahrenheit_to_celsius (double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static double celsius_to_fahrenheit(double celsius) {
        double farenheint = (9.0 / 5) * celsius + 32;
        return farenheint;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to celsius");
            System.out.println("2. Celsius to fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit : ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to celsius: " + fahrenheit_to_celsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter fahrenheit : ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to fahrenheit: " + celsius_to_fahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
         } while (choice != 0) ;
    }
}

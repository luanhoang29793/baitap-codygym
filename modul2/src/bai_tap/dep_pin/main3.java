package bai_tap.dep_pin;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        SwitchButton Button = new SwitchButton(false);
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Touch button: ");
            System.out.println("1. Turn off the lamp");
            System.out.println("2. Turn on the lamp");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                   Button.SwitchOff();
                    break;
                case 2:
                    Button.SwitchOn();
                    break;
            }
            System.out.println(Button.toString());

        } while (choice != 0);
    }
    }

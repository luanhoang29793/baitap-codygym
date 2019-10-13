package languageJava;

import java.util.Scanner;

public class display_shape {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println(" Menu ");
        System.out.println(" 1. Draw the rectangle");
        System.out.println(" 2. Draw the right triangle");
        System.out.println(" 3. Draw the left triangle");
        System.out.println("0. Exit");
        System.out.println(" Enter  your choice: ");
        choice = input.nextInt();
        while (choice!=0) {
            switch (choice) {
                case 1:
                    System.out.println( "Draw the rectangle");
                    for (int i = 0; i < 6; i++) {
                        System.out.println(" ");
                        for ( int j = 0 ; j < 6; j++){
                            System.out.print("*" );
                         }
                    }
                    break;
                case 2:
                    System.out.println( "Draw the right triangle");
                    for (int i = 0; i < 6; i++) {
                        System.out.println(" ");
                        for ( int j = 0 ; j < i; j++){
                            System.out.print("*" );
                        }
                    }
                    break;
                case 3:
                    System.out.println( "Draw the left triangle");
                    for (int i = 6; i > 0; i--) {
                        System.out.println(" ");
                        for ( int j = 0 ; j < i; j++){
                            System.out.print("*" );
                        }
                    }
                    break;
                case 0:

                   System.exit(0);
                default:
                    System.out.println("No choice!");

    }
            System.out.println(" ");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

        }
    }

}

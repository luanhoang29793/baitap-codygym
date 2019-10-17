package bai_tap.adam_eva_eat_apple;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        human adam = new human("adam",true,30);
        human eva = new human("eva",false,20);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong tao");
        int amountaple = scanner.nextInt();
        int choice = -1;

        do {
            System.out.println("Select human: ");
            System.out.println("1. Adam eat");
            System.out.println("2. Eva eat");
            System.out.println("3. Adam say");
            System.out.println("4. Eva say");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            if (amountaple <= 0) {
                System.out.println(" het tao");
            } else {
            switch (choice) {
                case 1:
                    adam.eat();
                    amountaple-=1;
                    System.out.println(" so luong tao con lai" + amountaple);
                    break;
                case 2:
                    eva.eat();
                    amountaple-=1;
                    System.out.println(" so luong tao con lai" + amountaple);
                    break;

                case 3:
                    System.out.println(" nhap cau noi cua eva: ");
                    String str4 = scanner.nextLine();
                    eva.say(str4);
                    break;
                case 0:
                    break;
            }
            }
        }
        while (choice!=0);
     }
}

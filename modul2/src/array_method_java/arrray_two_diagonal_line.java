package array_method_java;

import java.util.Scanner;

public class arrray_two_diagonal_line {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number1;
        System.out.println("Nhap kich thuoc ma tran vuong:");
        number1 = input.nextInt();
        int[][] myarray = new int[number1][number1];
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number1; j++) {
                myarray[i][j] = 1 + (int) (Math.random() * (100));
            }
        }
        System.out.println("mang duoc tao la: ");
        for (int i = 0; i < number1; i++) {
            System.out.print("\n");
            for (int j = 0; j < number1; j++) {
                System.out.print(myarray[i][j] + "\t ");
            }
        }
        for (int i = 0; i < number1; i++) {
            System.out.print("\n");
            for (int j = 0; j < number1; j++) {
                if (i == j) {
                    sum = sum +  myarray[i][j];
                }
            }

        }
        System.out.println("Tong duong cheo chinh la: " + sum);
    }
}


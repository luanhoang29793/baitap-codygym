package array_method_java;

import java.util.Scanner;

public class sum_colum_array {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            int number1;
            int number2;
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
            System.out.println(" Nhap cot can tinh");
            number2 = input.nextInt();
            for (int i = 0; i < number1; i++) {
                System.out.print("\n");
                for (int j = 0; j < number1; j++) {
                    if (number2 == j) {
                        sum = sum +  myarray[i][number2];
                    }
                }

            }
            System.out.println("Tong cot" + number2 +  " la: " + sum);
        }
    }



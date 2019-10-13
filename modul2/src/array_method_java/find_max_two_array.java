package array_method_java;

import java.util.Scanner;

public class find_max_two_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so dong: " + "\n");
        int number1 = input.nextInt();
        System.out.print("Nhap so cot: " + "\n") ;
        int number2 = input.nextInt();
        int[][] myarray = new int[number1][number2];
        for (int row = 0; row < number1;row++) {
            for (int colum = 0; colum < number2; colum++) {
                myarray[row][colum] = 1 + (int)(Math.random() * (100));
            }
        }
        System.out.println("mang duoc tao la: ");
        for (int row =0; row <number1; row ++) {
            System.out.print( "\n");
            for (int colum = 0; colum < number2  ; colum ++) {
                System.out.print(myarray[row][colum]+ "\t ");
            }
        }
        int max;
        max = myarray [0][0];
        for (int row =0; row <number1; row ++) {
            for (int colum = 0; colum < number2  ; colum ++) {
                if (max < myarray[row][colum]){
                    max = myarray[row][colum];
                }
            }
        }
        System.out.println( "\n");
        System.out.print("Gia tri lon nhat la: " + max );
    }
}

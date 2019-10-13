package array_method_java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class add_two_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        System.out.println("Nhap do dai mang 1:");
        number1 = input.nextInt();
        int[] array1 = new int[number1];
        System.out.print(" Mang 1 la");
        for (int i = 0; i < number1; i++) {
            array1[i] = 1 + (int) (Math.random() * 100);
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + "\t");
        }
        int number2;
        System.out.print("Nhap do dai mang 2:");
        number2 = input.nextInt();
        int[] array2 = new int[number2];
        for (int i = 0; i < number1; i++) {
            array2[i] = 1 + (int) (Math.random() * 100);
        }
        System.out.println(" Mang 2 la");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        int number3;
        number3 = number1 + number2;
        int[] array3 = new int[number3];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[number1 + j] = array2[j];
        }
        System.out.println("mang3 la:");
        for (int i = 0; i < array3.length ; i++) {
            System.out.println(array3[i]);
        }
        System.out.println("ss" );
        System.out.println(number3);
    }

}



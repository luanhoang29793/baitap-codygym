package array_method_java;

import java.lang.module.FindException;
import java.util.Scanner;

public class delete_element_of_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int element;
        int index;
        System.out.println("Nhap do dai mang : ");
        number1 = input.nextInt();
        int[] array1 = new int[number1];
        System.out.print(" Mang duoc tao la la " + " \t");
        for (int i = 0; i < number1; i++) {
            array1[i] = 1 + (int) (Math.random() * 100);
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println("Nhap gia tri can xoa ");
        element = input.nextInt();
        index = -1;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == element) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.print("vi tri " + element + "nam o vi tri " + index + "\n");
        for (int i = index ; i < array1.length-1; i++) {
            array1[i] = array1[i + 1];
        }
        System.out.print("mang duoc xoa la ");
        for (int i = 0; i < array1.length-1; i++) {
            System.out.print(array1[i] + "\t");
        }
        } else {
                System.out.println("khong tim thay " + element + " trong mang");
            }
        }
    }


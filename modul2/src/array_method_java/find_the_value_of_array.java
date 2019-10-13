package array_method_java;

import java.util.Scanner;

public class find_the_value_of_array {
    public static void main(String[] args) {
        String[] students = {"luan", "thanh", "man", "cuong"};
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh: ");
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i = 0 ; i <students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println(input_name + " nam o vi tri " + (i + 1) + " trong danh sach");
               check =true;
                System.exit(0);
            }
            }
        if (!check)
        System.out.println("khoong tim thay");
        }
    }


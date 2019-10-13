package array_method_java;

import java.util.Scanner;

public class apply_count_studens_pass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("nhap so luong sinh vien" + "\n");
            number = input.nextInt();
            if (number > 30)
                System.out.print("So luong sinh vien khong duoc vuot qua 30 " + "\n");
        } while (number > 30);
        int[] myArray = new int[number];
        int count = 0 ;
        for (int i = 0; i < number; i++) {
            myArray[i] = 1 + (int) (Math.random() * (10));
        }
        System.out.print("Diem cac sinh vien la: " +"\n");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }
        System.out.println("\n");
        System.out.println("Danh sach sinh vien thi dau la: ");
        for (int i = 0; i < myArray.length; i++) {
            if ( myArray[i] >= 5 && myArray[i] <= 10) {
                System.out.print(myArray[i] + "\t");
                count++;
            }
        }
        System.out.println("\n");
        System.out.println("Tong sinh vien thi dau la " + count);
    }
}

package array_method_java;

import java.util.Scanner;

public class count_appear_char_of_array {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        int count1;
        count1 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap chuoi");
        chuoi = input.nextLine();
        System.out.print(" Nhap ky tu de dem");
        kytu = input.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kytu) {
                count1++;
            }
        }
        System.out.print(" so lương xuat hien " + kytu + " là " + count1);

    }
}

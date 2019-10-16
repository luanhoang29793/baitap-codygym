package class_and_method_of_ja.Stop_watch;

import java.util.Scanner;

public class Stop_Watch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong cac con so");
        int lenght;
        lenght = scanner.nextInt();
        int[] arr = new int[lenght];
        System.out.println("mang ban dau: ");
        for (int i = 0; i < lenght; i++) {
            arr[i] = (int) (Math.random() * 1000);
            System.out.print(arr[i] + " ");
        }
        class_StopWatch time = new class_StopWatch();
        time.Start();
        int transfer,minindex;
        // luon cap phat ngoai vong lap( do ton bo nho moi khi chay vong lap)
        for (int i = 0; i <lenght-1 ; i++) {
            minindex = i;
            for (int j = i+1; j < lenght ; j++) {
                if (arr[j] < arr[minindex])
                    minindex = j;
            }
            if (i != minindex) {
                transfer =arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = transfer;
            }
        }
        time.Stop();
        System.out.println(" ");
        System.out.println(" Mang sau khi sap xep chon la: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" Thoi gian thuc hien: " + time.getElapsedTime()+ "ms");
    }
}

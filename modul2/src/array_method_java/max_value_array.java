package array_method_java;

import java.util.Scanner;
public class max_value_array {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("so luong so phan tu cua mang");
        int number;
        int max;
        number = input.nextInt();
        int[] myArray = new int [number];
        for (int i = 0; i < number;i++) {
            myArray[i] = 1+(int)(Math.random()*(100));
        }
        System.out.println("Mang duoc tao la");
         for (int i = 0; i < number; i ++) {
             System.out.print(myArray[i] + "\t");
        }
         max = myArray[0];
         for (int i = 1 ; i < myArray.length;i++) {
             if (max < myArray[i]){
                 max = myArray[i];
             }
         }
        System.out.println("\n");
        System.out.print("Gia tri lon nhat  trong mang la " + max);


    }
}

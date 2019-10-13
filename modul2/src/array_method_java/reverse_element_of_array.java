package array_method_java;

import java.util.Scanner;

public class reverse_element_of_array {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number;
            do {
                System.out.print("nhap do dai mang" + "\n");
                number = input.nextInt();
                if (number > 20)
                    System.out.print("Do dai khong duoc qua 20 " + "\n");
            } while (number > 20);
            int[] myArray = new int[number];
            for (int i = 0; i < number; i++) {
                myArray[i] = 1 + (int) (Math.random() * (100));
            }
            System.out.print("Mang duoc tao la" + "\n");
            for (int i = 0; i < number; i++) {
                System.out.print(myArray[i] + "\t");
            }
            for (int i = 0; i < myArray.length/2; i++) {
                int temp = myArray[i];
                myArray[i] = myArray[myArray.length - (1 +i)  ];
                myArray[myArray.length - (1 + i)] = temp;
            }
            System.out.print("\n");
            System.out.print("Mang duoc dao la " + "\n");
            for (int j = 0; j < number; j++) {
                System.out.print(myArray[j] + "\t");
            }
        }
}

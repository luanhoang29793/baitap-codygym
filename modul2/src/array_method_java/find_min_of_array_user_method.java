package array_method_java;

import java.util.Scanner;

public class find_min_of_array_user_method {
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
        int index = minvalue(myArray);
        System.out.print("\n");
        System.out.print( ("Gia tri nho nhat la: " + myArray[index]));
    }
public static int minvalue (int []array) {
    int min = array[0];
    int index = 0;
    for (int i =0 ; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
            index = i;
        }
    }
    return index;
}
}

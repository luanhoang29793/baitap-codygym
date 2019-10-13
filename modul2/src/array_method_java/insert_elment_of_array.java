package array_method_java;

import java.util.Scanner;

public class insert_elment_of_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int insertnumber;
        int index;


        do {
            System.out.print("nhap do dai mang" + "\n");
            number = input.nextInt();
            if (number > 20)
                System.out.print("Do dai khong duoc qua 20 " + "\n");
        } while (number > 20);
        int[] myArray = new int[number];
        int[] myArray2 = new  int[myArray.length+1];
        for (int i = 0; i < number ; i++) {
            myArray[i] = 1 + (int) (Math.random() * (100));
        }
        System.out.print("Mang duoc tao la" + "\n");
        for (int i = 0; i < number; i++) {
            System.out.print(myArray[i] + "\t");
        }
        System.out.print( "nhap so can chen: " +"\n ");
        insertnumber = input.nextInt();
        System.out.print("\n" + "nhap vi tri can chen " + insertnumber + " vao mang"+"\n ");
        index = input.nextInt();
        if ((index < 0) | (index >= myArray.length - 1))
        {
            System.out.print("Khong chen duoc " + insertnumber + " vao mang" + "\n");
            System.exit(0);
        } else {

        for (int i = 0;i < index;i ++){
        myArray2 [i] =myArray [i];
    }
        myArray2[index] = insertnumber;
            for (int i = index+1; i <myArray.length ; i++) {
                myArray2[i] = myArray[i-1];
            }
            myArray2[myArray2.length-1] = myArray[myArray.length-1];
        }
        System.out.print("Mang duoc tao la " + "\n");
        for (int i = 0; i <myArray2.length ; i++) {
            System.out.print(myArray2[i] + "\t");

        }
    }
}

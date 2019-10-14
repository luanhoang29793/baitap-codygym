package languageJava;

import java.util.Scanner;

public class use_opetator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float width;
        float height;
        System.out.println("Enter width: ");
        width = input.nextFloat();
        System.out.println("Enter height");
        height = input.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}

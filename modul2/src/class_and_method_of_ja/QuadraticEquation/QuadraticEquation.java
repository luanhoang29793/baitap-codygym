package class_and_method_of_ja.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a:");
        double a = scanner.nextDouble();
        System.out.println("Enter the b:");
        double b = scanner.nextDouble();
        System.out.println("Enter the c:");
        double c = scanner.nextDouble();
        Acount qua = new Acount(a, b, c);
        System.out.println(qua.getDiscriminant());
        if (qua.getDiscriminant() > 0) {
            System.out.println(" phuong trinh hai ngiem:");
            System.out.println(" Nghiem mot la :" + qua.getRoot1() );
            System.out.println(" Nghiem hai la: " + qua.getRoot2());
        } else if (qua.getDiscriminant() == 0) {
            System.out.println("pt mot ngiem");
        } else {
            System.out.println("pt vo ngiem");
        }
    }

}

package bai_tap.ve_tinhdien3hinh;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap chieu dai hoac ban kinh hinh tron," +
                " 1 canhh hinh vuong");
        double number1 = scanner.nextDouble();
        System.out.println("Nhap chieu dai hinh chu nhat: ");
        double number2 = scanner.nextDouble();

        shap1 shap2 = new shap1(new Square(),new Circle(),new Rectangle());
        shap2.setCircle(number1);
        shap2.setRectangle(number1,number2);
        shap2.setSquare(number1);
        System.out.println(shap2.toString());
        shap2.draw();
    }

}

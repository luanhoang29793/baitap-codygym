package language;
import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("linear Equation Resolver");
        System.out.println("Given a quation as 'a * x +b =0',please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a =scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a ! = 0) {
            double solution = -b/a;
            System.out.println("The solution is: %f!",solution);
        } else {
            if ()
        }


    }
}

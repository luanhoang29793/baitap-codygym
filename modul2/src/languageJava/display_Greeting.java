package languageJava;
import java.util.Scanner;
public class display_Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = scanner.nextLine();
        System.out.print("Hello: " + name);
    }
}

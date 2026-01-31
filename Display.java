import java.util.Scanner;

public class Display {
    public static void Welcome() {
        System.out.println("Enter Number");
    }

    public static void Interface() {
        System.out.println("Enter 0-9 to Add Number");
        System.out.println("Enter (+ - * / %) to Operator ");
    }

    public static void DisplayResult(double result) {
        System.out.println("= " + result);
    }
}

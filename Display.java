import java.util.Scanner;

public class Display {
    public static void Interface() {
        System.out.println(" _____________________ ");
        System.out.println("|  _________________  |");
        System.out.println("| |               0 | |");
        System.out.println("| |_________________| |");
        System.out.println("|  ___ ___ ___   ___  |");
        System.out.println("| | 7 | 8 | 9 | | + | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | 4 | 5 | 6 | | - | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | 1 | 2 | 3 | | x | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | . | 0 | = | | / | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("|_____________________|");
    }

    public static void InitNum() {
        System.out.println("Enter 0-9 to Add Number");
    }

    public static void nextNum() {
        System.out.println("Enter next number: ");
    }

    public static void OperatorList() {
        System.out.println("Enter (+ - * / %) to Operator ");
    }

    public static void DisplayResult(double result) {
        System.out.println("= " + result);
    }
}

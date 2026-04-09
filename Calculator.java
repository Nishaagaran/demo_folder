import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select operation (1 = Addition, 2 = Subtraction): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + num1 + " + " + num2 + " = " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + num1 + " - " + num2 + " = " + subtract(num1, num2));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

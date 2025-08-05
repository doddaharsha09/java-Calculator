import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        char repeat;

        do {
            System.out.println("---- Simple Calculator ----");

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            calc.setNumbers(a, b);

            System.out.print("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            try {
                double result = 0;
                switch (op) {
                    case '+':
                        result = calc.add();
                        break;
                    case '-':
                        result = calc.subtract();
                        break;
                    case '*':
                        result = calc.multiply();
                        break;
                    case '/':
                        result = calc.divide();
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        continue;
                }
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Do you want to calculate again? (y/n): ");
            repeat = sc.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("Calculator closed.");
        sc.close();
    }
}

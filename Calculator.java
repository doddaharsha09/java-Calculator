import java.util.Scanner;

class Calculator {
    private double num1;
    private double num2;

    public void setNumbers(double n1, double n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }
}

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

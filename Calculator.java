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

package Lecture2;

public class CalculatorLauncher {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        Calculator calculator = new Calculator();

        int sum = calculator.sum(a, b);
        System.out.println("Sum is " + sum);

        int subst = calculator.subst(a, b);
        System.out.println("Subtraction is " + subst);

        int multi = calculator.multiply(a, b);
        System.out.println("Multiply is " + multi);

        int divis = calculator.division(a, b);
        System.out.println("Division is" + divis);
    }
}


import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt the user for the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Prompt the user for the operator
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform the corresponding arithmetic operation
            double result = 0;
            boolean validOperator = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    break;
                default:
                    validOperator = false;
                    System.out.println("Invalid operator. Please enter one of +, -, *, /.");
            }

            if (validOperator) {
                // Display the result
                System.out.println("The result is: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred. Please make sure you enter valid numbers and an operator.");
        } finally {
            scanner.close();
        }
    }
}

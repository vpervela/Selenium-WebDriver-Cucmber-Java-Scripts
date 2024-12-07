package support.CodingChallengesPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        //take input for operator
        System.out.println("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        //take input for second number
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        //perform operation based on operator using switch case
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error : Cannot divide by zero.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
        //System.out.println("Result : " + result);
    }
}

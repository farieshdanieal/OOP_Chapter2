/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticprog;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class ArithmeticProg {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;  
        int remainder = num1 % num2;
        int increment = ++num1;
        int decrement = --num2;

        // Display the results
        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Difference: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Product: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Quotient: " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Remainder: " + num1 + " % " + num2 + " = " + remainder);
        System.out.println("Increment: " +increment);
        System.out.println("Decrement: " +decrement);

        // Close the scanner
        scanner.close();
    }
}


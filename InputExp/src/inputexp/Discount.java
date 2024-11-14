/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputexp;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the item name: ");
        String itemName = scanner.nextLine();
        
        System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter the quantity of the item: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Enter the discount rate (in percentage): ");
        double discountRate = scanner.nextDouble();
        double totalPrice = price * quantity;
        double discountAmount = (discountRate / 100) * totalPrice;
        double priceAfterDiscount = totalPrice - discountAmount;
        
        System.out.println("\nItem Information:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price After Discount: " + priceAfterDiscount);
        
        scanner.close();
    }
}
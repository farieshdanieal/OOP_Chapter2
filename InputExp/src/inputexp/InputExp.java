/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputexp;

/**
 *
 * @author User
 */

//library for scanner to read input from user
import java.util.Scanner;
public class InputExp {
   public static void main(String[] args) {
        
         String name;
         float height;
         float weight;
         float bmi;
         
         Scanner input = new Scanner(System.in);
         System.out.print("Insert Name: ");
    
         // Reads a single line from console
         // and stores into name variable
         name = input.nextLine();
    
         // Reads a float data type from the console
         // and stores into height variable
          System.out.print("Insert your Height (M):  ");
          height = input.nextFloat();
          
         // Reads a float data type from the console
         // and stores into weight variable
          System.out.print("Insert your Weight (KG):  ");
          weight = input.nextFloat();

         
          input.close();
          
         //Create a formula to calculate the BMI
         bmi = weight / (height * height);
    
         //prints the input inserted by the user
          System.out.printf("Your Body Mass index (BMI) is: %.2f ", +bmi);
    }

}




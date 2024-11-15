/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compundprog;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class CompoundProg {
    public static void main(String[] args) {
        int a; //show pre-increment
        int b; //show post-increment
        int c; //show pre-decrement
        int d; //show post-decrement
        
        Scanner input = new Scanner(System.in);
        System.out.print("Insert Integer for A: ");
    
        // Reads an integer from console
        // and stores into "a" variable
        a = input.nextInt();
        
        System.out.print("Insert Integer for B: ");
        // Reads an integer from console
        // and stores into "b" variable
        b = input.nextInt();
        
        System.out.print("Insert Integer for C: ");
        // Reads an integer from console
        // and stores into "c" variable
        c = input.nextInt();
        
        System.out.print("Insert Integer for D: ");
        // Reads an integer from console
        // and stores into "d" variable
        d = input.nextInt();
        
        input.close();
        
        System.out.println("");
        
        System.out.println("Pre-Increment:");
        System.out.println("Initial Value of A:"+a);
        System.out.println("Value of A after i++:"+(a++)); //use orginal value in this statement
        System.out.println("Final value of A: "+a);
        
        System.out.println("");
        
        System.out.println("Post-Increment:");
        System.out.println("Initial Value of B:"+b);
        System.out.println("Value of B after ++i:"+(++b)); //use new value in this statement
        System.out.println("Final value of B: "+b);
        
        System.out.println("");
        
        System.out.println("Pre-Decrement:");
        System.out.println("Initial Value of C:"+c);
        System.out.println("Value of C after i--:"+(c--)); //use orginal value in this statement
        System.out.println("Final value of C: "+c);
        
        System.out.println("");
        
        System.out.println("Pre-Decrement:");
        System.out.println("Initial Value of D:"+d);
        System.out.println("Value of D after i--:"+(--d)); //use new value in this statement
        System.out.println("Final value of D: "+d);
    }
}

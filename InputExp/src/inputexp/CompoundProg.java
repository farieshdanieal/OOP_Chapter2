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
public class CompoundProg {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Insert Integer for A: ");
    
        // Reads an integer from console
        // and stores into "a" variable
        a = input.nextInt();
        
        System.out.print("Insert Integer for B: ");
        b = input.nextInt();
        
        System.out.print("Insert Integer for C: ");
        c = input.nextInt();
        
        System.out.print("Insert Integer for D: ");
        d = input.nextInt();
        
        input.close();
        
        System.out.println("Pre-Increment:");
        System.out.println("Initial Value of A:"+a);
        System.out.println("Value of A after i++:"+(a++));
        System.out.println("Final value of A: "+a);
        
        System.out.println("Post-Increment:");
        System.out.println("Initial Value of B:"+b);
        System.out.println("Value of B after ++i:"+(++b));
        System.out.println("Final value of B: "+b);
        
        System.out.println("Pre-Decrement:");
        System.out.println("Initial Value of C:"+c);
        System.out.println("Value of C after i--:"+(c--));
        System.out.println("Final value of C: "+c);
        
        System.out.println("Pre-Decrement:");
        System.out.println("Initial Value of D:"+d);
        System.out.println("Value of D after i--:"+(d--));
        System.out.println("Final value of D: "+d);
    }
}

//package Quadratic;
/* a program to compute the roots of a
quadratic equation.*/

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double x1, x2, a, b, c, calculate;
        
   System.out.println("enter the values in this format : ax^2 + bx + c = 0");

        System.out.println("enter the a value: ");
        a = sc.nextDouble();
        
        System.out.println("enter the b value: ");
        b = sc.nextDouble();
        
        System.out.println("enter the c value: ");
        c = sc.nextDouble();

        calculate = Math.sqrt(Math.pow(b,2)-4*a*c);
	
	x1 = (-b + calculate) / (2 * a);
        
	x2 = (-b - calculate) / (2 * a);
	
	System.out.println("the roots are x =  " + x1 + " and "+ x2);
    
    
    }
    
}


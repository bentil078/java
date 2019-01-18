/*CALCULATING THE CIRCUMFERENCE OF A CIRCLE
*/

import java.util.Scanner;
import static java.lang.Math.PI;

public class Circumference{

	public static void main(String[] args){

		double circumference;
		double radius;
		

	Scanner sc = new Scanner(System.in);

	System.out.println("ENTER THE RADIUS OF THE CIRLCE: ");
		radius = sc.nextDouble();

	circumference = 2 * radius * PI;

	System.out.println("THE CIRCUMFERENCE OF THE CIRCLE IS: " + circumference);
		
	}

}

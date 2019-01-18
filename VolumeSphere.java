/*CALCULATING THE VOLUME OF A SPHERE
*/

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class VolumeSphere{

	public static void main(String[] args){

		double volume;
		double radius;
		double radiusCube;

	Scanner sc = new Scanner(System.in);

	System.out.println("ENTER THE RADIUS OF THE SPHERE: ");
		radius = sc.nextDouble();

	radiusCube = pow(radius, 3);
	

	volume = PI * radiusCube * 4 / 3;

	System.out.println("THE VOLUME OF THE SPHERE IS: " + volume);
		
	}

}

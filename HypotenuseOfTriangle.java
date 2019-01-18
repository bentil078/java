//calculating the hypotenuse of a Triangle

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Hypotenuse{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	double a, b, c, ans = 0;

	System.out.println("ENTER THE SIDE a OF THE TRIANGLE: ");
	a = sc.nextDouble();
	
	System.out.println("ENTER THE SIDE b OF THE TRIANGLE: ");
	b = sc.nextDouble();

	c = pow(a,2) + pow(b,2);
	ans = Math.sqrt(c);

	System.out.println("the length of the hypotenuse: " + ans);	

	}

}

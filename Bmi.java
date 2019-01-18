//calulating the body mass index of a person

import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

	double weight, height, bmi;



        System.out.println("enter your weight in kg: ");
        weight = sc.nextDouble();

	 System.out.println("enter your height in metres: ");
        height = sc.nextDouble();


	bmi = weight / Math.pow(height,2);

	if (bmi>=30)
	System.out.println("your are obese ");
        
	else if(bmi >=25.0 && bmi <= 29.9)
	System.out.println("your are overweight ");

	else if (bmi>=18.5 && bmi <=24.9)
	System.out.println("your are normal ");

		

	else
	System.out.println("your are underweight");
	
	}
}

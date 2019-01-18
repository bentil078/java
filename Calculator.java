/*THIS IS A SIMPLE PROGRAM TO ACCEPT 2 WHOLE NUMBERS
AND DISPLAY THE SUM, PRODUCT & DIFFERENCE
*/

import java.util.Scanner;

public class Calculator{

	public static void main(String[] args){

		int firstNumber;
		int secondNumber;
		int sum;
		int product;
		int difference;

	Scanner sc = new Scanner(System.in);

	System.out.println("ENTER FIRST WHOLE NUMBER");
		firstNumber = sc.nextInt();

	System.out.println("ENTER SECOND WHOLE NUMBER");
		secondNumber = sc.nextInt();

	sum = firstNumber + secondNumber;
	difference = firstNumber - secondNumber;
	product = firstNumber * secondNumber;

System.out.println("THE SUM OF "+ firstNumber +" + "+ secondNumber+ " IS: " + sum);

System.out.println("THE DIFFERENCE OF "+ firstNumber +" - "+ secondNumber +" IS: " + difference);

System.out.println("THE PRODUCT OF " + firstNumber+" * "+ secondNumber+" IS: " + product);
	
	}

}

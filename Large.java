//display the larger number of two numbers

import java.util.Scanner;

public class Large {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

	int first, second;

 System.out.println("enter 2 different numbers");

        System.out.println("enter first number: ");
        first = sc.nextInt();

	System.out.println("enter second number: ");
        second = sc.nextInt();

	if (first > second)
	System.out.println("the first number is bigger ");
        
	else if(first == second)
	System.out.println("they are equal ");

	else
	System.out.println("the second number is bigger");
}
}

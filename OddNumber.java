//Determine whether a number is odd or even
import java.util.Scanner;

public class Odd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

	int first;
 

        System.out.println("enter the number: ");
        first = sc.nextInt();
	
	


	if (first%2 == 0)
	System.out.println("the number is even ");
        
	else
	System.out.println("it is odd");
}
}

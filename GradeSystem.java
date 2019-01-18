import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

	double number;



        System.out.println("enter your marks: ");
        number = sc.nextDouble();

	

	if (number>=80 && number <=100)
	System.out.println("your grade is A ");
        
	else if(number >=70 && number < 80)
	System.out.println("your grade is B ");

	else if (number>=60 && number <70)
	System.out.println("your grade is C ");

	else if (number>=50 && number <60)
	System.out.println("your grade is A ");

	

	else
	System.out.println("your grade is E");
	
	}
}

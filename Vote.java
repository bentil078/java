import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

	int age;
 System.out.println("are you eligible to vote? \n\n");

        System.out.println("enter your age: ");
        age = sc.nextInt();

	if (age>=18 && age <= 120)
	System.out.println("you are eligible to vote ");
        
	else
	System.out.println("you are a minor");
}
}

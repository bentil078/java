import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

	

 System.out.println("*****************************************");

	System.out.println("Enter 1 for Addition");
	System.out.println("Enter 2 for multiplication");
	System.out.println("Enter 3 for exit");


System.out.println("*****************************************");
	
	System.out.println("Make a choice: ");

	int i = sc.nextInt();
	
	switch(i){
		case 1:
			System.out.println("add");
    			break;

		case 2:
			System.out.println("multiply");
    			break;

		case 3:
			System.exit(0);
    			break;
		
		default:
			System.out.println("check your input");
			break;
}
	}
}

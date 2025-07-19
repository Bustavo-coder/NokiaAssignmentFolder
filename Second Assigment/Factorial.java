import java.util.Scanner;
public class Factorial {

public static void main (String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter The Number You Want to find the factorial");
	int factorialnput = input.nextInt();
	int product = 1;
	for(var i = factorialnput ; i > 0;i--){
		product *= i;	
}
	System.out.println("The factorial of " + factorialnput + " is " + product);	
}
}
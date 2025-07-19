import java.util.Scanner;
public class Sum {

public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 to Start ApplicATION");
		int codeStoper = input.nextInt();
		do{
		System.out.println("Enter the First Number");
		int userInut1 = input.nextInt();
		System.out.println("Enter the Second Number");
		int userInut2 = input.nextInt();
		int sum = userInut1 + userInut2;
		System.out.println("The Sum Of The Number is " + sum);
		System.out.println("Enter 0 to close application and 1 to continue");
		codeStoper = input.nextInt();
		} while(codeStoper != 0);
		
}
}
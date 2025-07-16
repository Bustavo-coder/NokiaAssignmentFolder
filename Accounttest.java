 import java.util.Scanner;
public class Accounttest{
	public static void main (String [] args){

	Scanner input = new Scanner(System.in);
	Accounts collectName = new Accounts();

	System.out.println("Enter Your Fullname");
	String userName = input.nextLine();
	collectName.setName(userName);
	System.out.printf("%s%s%n","The UserName is " ,(collectName.getName(userName)));




	System.out.println("Input Your first Digits to do the additions");
	 int firstNumber = input.nextInt();
	
	System.out.println("Input Your Second Digits to do the additions");
	int SecondNumber = input.nextInt();

	System.out.printf("%s%d","The Sum is ",(collectName.addition( firstNumber, SecondNumber)));
	
}
}
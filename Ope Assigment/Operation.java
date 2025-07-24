import java.util.Scanner;
public class Operation{
	public static void main (String [] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter Your first number");
	int firtUserinput = input.nextInt();
	System.out.println("Enter Second Number");
	int secondUserInput = input.nextInt();
	System.out.println("Enter you type of operation + * / -");
	char operator = input.next().charAt(0);

	int result = 1;
	if (operator == '+') result = firtUserinput + secondUserInput;
	else if(operator == '-') result = firtUserinput - secondUserInput;
	else if(operator == '*') result = firtUserinput * secondUserInput;
	else if(operator == '/') result = firtUserinput / secondUserInput;
	else System.out.print("Invalid Operatos");
	System.out.print(result);
	
	
	
	

}



}

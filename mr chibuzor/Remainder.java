import java.util.Scanner;
public class Remainder {
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Your Number");
	 int userInput = input.nextInt();
	if(userInput % 3 == 0){
	System.out.printf("%d%s", userInput ,"Is Divisible by 3");	
}	else {
		System.out.printf("%d%s", userInput ,"Is Not Divisible by 3");
	};
	
}
}
import java.util.Scanner;
	public class Divisor {
		public static void main (String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the first Number");
	int firstNumber = input.nextInt();
	

	System.out.println("Enter the second number");
	int secondNumber = input.nextInt();
		
	if((2 * secondNumber) % (3 * firstNumber)  == 0){
		System.out.printf("%d %s %d",  firstNumber ,"is a multiple of",secondNumber);
}else {
	System.out.printf("%d %s %d",  firstNumber ,"is a not multiple of",secondNumber);
};
}
}
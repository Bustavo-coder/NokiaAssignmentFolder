import java.util.Scanner;
public class Seperatingintegers {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter Numbers From 10000 to 99999");
	int userInput = input.nextInt();
	
	int firstNumber = userInput / 10000;
	int secondNumber = userInput % 10000 / 1000;
	int thirdNumber = userInput % 1000 / 100;
	int fourthNumber = userInput % 100 / 10;
	int fifthNumber = userInput % 10 ;
	
	if(userInput >= 10000 && userInput <= 99999){
		System.out.printf("%d %d %d %d %d", firstNumber , secondNumber , thirdNumber , fourthNumber, fifthNumber);
}	else{
		System.out.printf("Invalid Input");
}
}
}
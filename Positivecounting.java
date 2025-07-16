import java.util.Scanner;
public class Positivecounting{



public static void main (String [] args){

	


		Scanner input = new Scanner(System.in);
		int sumNegative = 0;
		int sumPositve = 0;
		int sumZero = 0;
		System.out.println("Enter the Numers enter 10000 to Close Application");
		int userInput = input.nextInt();

	while(userInput != 10000){

		if(userInput > 0) sumPositve++;
		if(userInput < 0) sumNegative++;
		if(userInput == 0)sumZero++;
		System.out.println("Enter the Numers enter 10000 to Close Application");
		userInput = input.nextInt();


}
		System.out.println("The sum positve Numbers are "  + sumPositve);
		System.out.println("The sum negative Numbers are " +  sumNegative);
		System.out.println("The sum zeros Numbers are " + sumZero);
		





		



}
}
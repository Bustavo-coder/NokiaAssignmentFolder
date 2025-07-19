import java.util.Scanner;
public class First {


	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		int random = (int) (Math.random()*101);
		System.out.println("Enter Your Guess to check if it correct");
		int userInput = input.nextInt();


		while(userInput != random){
		if(userInput <  random) System.out.println("Too Low Try Agian");
		else System.out.println("Too High Try Agian");
		System.out.println("Enter Your Guess to check if it correct");
		userInput = input.nextInt();
							}
		System.out.println("Correct Anser");
		
}

}
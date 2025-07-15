import java.util.Scanner;
public class Guess {

public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		int random = (int) (Math.random() * 21);
		System.out.println("Guess the Number from 1 - 20");
		int userGuess = input.nextInt();

	while(random != userGuess){

	if(userGuess < random) System.out.println("Too Low Try Again");
	if(userGuess > random) System.out.println("Too High Try Again🥚🥚🥚🥚");
	System.out.println("Guess the Number from 1 - 20");
		userGuess = input.nextInt();
	
		
}
	
System.out.println("Corect👍👍👍👍👍✔✔");
				
}
}


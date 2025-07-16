import java.util.Scanner;

public class Random{
	public static void main (String [] args){
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter Your Guess between 1 and 0");
	int userInput = input.nextInt();
	
	int systemGuess = (int) (Math.random() * 2) ;
	String result = (systemGuess == 0)?"Head":"Tail";
	
	if(userInput == systemGuess){
	 System.out.printf("%s%s", "You are correct it is ",result);

}else{
	int counter = 5;
	System.out.println("Incorrect enter Your Guess again between 1 and 0");
	int userInput2 = input.nextInt();
	
if(userInput2 != systemGuess){
	while(counter > 0){
	System.out.printf("%s%d%s%n" ,"Try again you have ",counter," Trial");
	System.out.println("Incorrect enter Your Guess again between 1 and 0");
	 userInput2 = input.nextInt();
	counter--;
}
}else{
	System.out.printf("%s%s", "You are correct it is a ",result);
};


if(counter <= 0){
	System.out.println("You Lost The Game");
}
}
}	
}
import java.util.Scanner;
public class Compare {
	public static void main (String [] args){
	Scanner input = new Scanner (System.in);
	 System.out.println("Input Your Integer");
	int userInput = input.nextInt();
	int sumSquare = userInput * userInput + userInput;	
	System.out.println(sumSquare);
	if(sumSquare > 100){
	System.out.printf("%d%n%s", sumSquare,"Is Greater Than 100");
	}else{
	System.out.printf("%d%n%s", sumSquare,"Is Lesser Than 100");
	};
		
}
}
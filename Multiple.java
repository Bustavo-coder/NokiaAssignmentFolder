import java.util.Scanner;
	public class Multiple {
		public static void main (String [] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Input the Number");
		int userInput = input.nextInt();

	if(userInput % 6 == 0 || userInput % 7 == 0){
		System.out.printf("%d%s", userInput, " is a multiple of 6 or is a multiple of 7");
	
	}else{
	System.out.printf("%d%s", userInput, " is not a multiple of 6 nor is a multiple of 7");
};	

			
}
}
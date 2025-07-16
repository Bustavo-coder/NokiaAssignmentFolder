import java.util.Scanner;
	public class Stringlenght {
		public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Iput to check for the lenght, to check for indexof, to print first Charcter , convert to lowercase and uppercase check if its empty");
		String userInput = input.nextLine();
		System.out.printf("%s %d %d %c","The Lenght is", userInput.length(),userInput.indexOf('D'),userInput.charAt(3));
		System.out.printf("%s"userInput.lowerCase(userInput));
}
}
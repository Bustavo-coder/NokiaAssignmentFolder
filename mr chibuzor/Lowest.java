import java.util.Scanner;
	public class Lowest {
		public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter five Numbers");

		System.out.println("Enter first Number");
		int number1 = input.nextInt();

		System.out.println("Enter second Number");
		int number2 = input.nextInt();


		System.out.println("Enter Third Number");
		int number3 = input.nextInt();

		System.out.println("Enter four Number");
		int number4 = input.nextInt();

		System.out.println("Enter fifth Number");
		int number5 = input.nextInt();
		
		int max = number5;
		int min = number5;
		
		if(number4 > max ) {max = number4;};
		if(number3 > max) { max= number3;};
		if(number2 > max) {max = number2;};
		if(number1 > max ) {max  = number1;};

		if(number4 < number1) {min =number4;};
		if(number3 < min) {min = number3;};
		if(number2 < min) {min = number2;};
		if(number1 < min) {min = number1;};

		System.out.printf("%s%d%n", "The Higheset Number is ", max);
		System.out.printf("%s%d", "The Lowest Number is ", min);
		
		
			
}
}
   import java.util.Scanner;

	public class Staticvar {
		public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter first number");
	int a = input.nextInt();
	
	System.out.println("Enter second number");
	int b = input.nextInt();
	
	a = 2*(a);
	b = a/2;
	
	
	System.out.printf("%d%n%d", a,b);
}
}
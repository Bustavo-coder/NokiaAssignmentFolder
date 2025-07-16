import java.util.Scanner;
public class Arithmethic{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Input You First Integers");
	int firstInput = input.nextInt();

	System.out.println("Input You Second Integers");
	int secondInput = input.nextInt();

	System.out.println("Input You third Integers");
	int thirdInput = input.nextInt();
	
	int sum =firstInput + secondInput + thirdInput;
	System.out.printf("%s%n%d%n", "Your Sum Is", sum);

	int product = (firstInput * secondInput ) *  thirdInput;
	System.out.printf("%n%s%n%d%n","The Product is", product);
	
	int avg = (firstInput + secondInput +thirdInput)/3;
	System.out.printf("%s%n%d%n","The Average is" ,avg);

} 
}
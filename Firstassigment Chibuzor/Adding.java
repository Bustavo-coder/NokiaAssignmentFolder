import java.util.Scanner;

	public class Adding {
		public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter your interger between 0 and 1000");
	int a = input.nextInt();
	
	
	int getFirstNumber = (a/100);
	int getSecondNumber = (a%100)/10;
	int getLastNumber = (a % 10);
	
	int sum = getFirstNumber + getSecondNumber + getLastNumber;
	System.out.printf("%s%d","The sum of the Numbers is : " ,sum);
	

}
}
import java.util.Scanner;
public class Reader {
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter Your Fisrt Integer");
	int number1 = input.nextInt();

	System.out.println("Enter Your Second Integer");
	int number2 = input.nextInt();
	
	System.out.println("Enter Your Third Integer");
	int number3 = input.nextInt();
	
	System.out.println("Enter Your Fourth Integer");
	int number4 = input.nextInt();

	System.out.println("Enter Your Fifth Integer");
	int number5 = input.nextInt();
	 
	int max1 = number1;
	int secondLargest = Integer.MIN_VALUE;
	
if (number2 > max1){ max1 = number2;};
if(number3 > max1) {max1 = number3;};
if(number4 > max1)  {max1 = number4;};
if(number5 > max1) {max1 = number5;};



if(max1 > number1 && number1 > secondLargest) { secondLargest = number1;};
if(max1 > number2 && number2 > secondLargest) {secondLargest = number2;};
if(max1 > number3 && number3 > secondLargest) {secondLargest = number3;};
if(max1 > number4 && number4 > secondLargest) {secondLargest = number4;};
if(max1 > number5 && number5 > secondLargest) {secondLargest = number5;};


 System.out.printf("%n%d%s",max1, "Is The maximum number");
 System.out.printf("%n%d%s",secondLargest, "Is The Second Maximum number");
}
}
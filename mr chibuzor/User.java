import java.util.Scanner;
public class User {
	public static void main (String [] args){
 	 Scanner userInput = new Scanner(System.in);
	 System.out.print("Enter First Integer");
	 int input1 = userInput.nextInt();
	  
	System.out.print("Enter Second Integer");
	int input2 = userInput.nextInt();
	input1 = input1 * input1;
	input2 = input2 * input2;
	int sum = input1 + input2;
	int diff = input1 - input2;
	
	System.out.printf("%d,%d,this are the squares",input1,input2);
	System.out.println(sum);
	System.out.println(diff);
	
}
}
import java.util.Scanner;
public class Charchtervaluechecker {
	public static void main (String [] args ){
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Your Charcter to check for the value");

	 char charcter = input.next().charAt(0);
	System.out.printf("%s%c%s%d", "The Value of Charcter ", charcter , " is ", (int)(charcter));
}
}
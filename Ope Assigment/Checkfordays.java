import java.util.Scanner;
public class Checkfordays{
	public static void main (String [] args){

	 Scanner input = new Scanner(System.in);
	Checkformonth user = new Checkformonth();

	System.out.println("Input The Month we are in");
	String userMonth = input.next();
	userMonth .toLowerCase();

	System.out.println("Input The day we are in");
	int userDay = input.nextInt();

	System.out.println("Input The year we are in");
	int userYear = input.nextInt();

	
	
	int daysRemain = user.amountofDays(userDay, userYear, userMonth);
	System.out.printf("%s%d", "The Remaining days is ", daysRemain);
	
	
		
}
}
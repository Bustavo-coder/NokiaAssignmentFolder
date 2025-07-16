
import java.util.Scanner;
public class Class{
	public static void main (String [] args){
		Scanner enter = new Scanner(System.in);
		System.out.print("Enter User Name");
		String bale = enter.nextLine();

		System.out.print("Enter Acct Number");
		int accountNumber = enter.nextInt();
	
		System.out.print("Input Your Date Of Birth");
		String dOb = enter.nextLine();

		System.out.printf("%s,%d,%s", bale,accountNumber,dOb);
}
}

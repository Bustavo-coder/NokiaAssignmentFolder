import java.util.Scanner;
public class Finace {
	public static void main (String [] args){
		
	Scanner accept = new Scanner(System.in);
	System.out.println("Enter annualIntrest Rate");

	double intrestRate = accept.nextDouble();
	
	System.out.println("Enter balance");
	double balance = accept.nextDouble();
	
	double intrest = balance * (intrestRate/1200);
	System.out.printf("%s%f%s", "The Intrest is ",intrest,"%");

}
}
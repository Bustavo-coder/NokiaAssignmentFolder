import java.util.Scanner;

	public class Findingrunaway {
		public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter velocity in m\s");
	double velocity = input.nextDouble();

	System.out.println("Enter acceleration in m\s");
	double acceleration = input.nextDouble();
	
	double lenght = (velocity* velocity)/(2*acceleration);

	System.out.printf("%s%f", "The Minimum Runway lenght for this airplane is ",lenght);
	
}
}
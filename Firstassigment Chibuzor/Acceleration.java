 import java.util.Scanner;
public class Acceleration{
	public static void main (String [] args) {
		Scanner outPut = new Scanner(System.in);

		System.out.println("Enter Velocity0");
		double velocity0 = outPut.nextDouble();
		
		System.out.println("Enter Velocity1");
		double velocity1 = outPut.nextDouble();
		
		System.out.println("Enter timetaken");
		double time = outPut.nextDouble();
		
		double accEleration = (velocity1 - velocity0)/time;
		System.out.printf("%s%f", "Average Acceleration is ",accEleration);			
			

			
}
}
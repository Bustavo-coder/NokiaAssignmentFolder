import java.util.Scanner;
public class Costofdriving{
 public static void main (String [] args){
	Scanner outPut = new Scanner(System.in);
	
		
	System.out.println("Enter the Driving distance");
	double drivingDistance = outPut.nextDouble();
	
	System.out.println("Enter miles per Gallon");
	double milesPerG  = outPut.nextDouble();

	System.out.println("Enter price per gallon");
	double pricePerG = outPut.nextDouble();

	double costofTrip =drivingDistance  /(milesPerG *pricePerG);
        System.out.printf("%f%s",costofTrip, " is the cost for the trip");
}
}
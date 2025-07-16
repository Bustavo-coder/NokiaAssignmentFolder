import java.util.Scanner;
public class Energycalc{
 public static void main (String [] args){
	Scanner outPut = new Scanner(System.in);


	System.out.println("Enter Your Intial Temperature");
	double initialTemperature = outPut.nextDouble();

	System.out.println("Enter Your Final Temperature");
	double finalTemperature = outPut.nextDouble();
 	
	System.out.println("Enter Your Amount of Water in Kg");
	double water = outPut.nextDouble();

	 double q = water * (finalTemperature - initialTemperature) * 4184;
	System.out.printf("%s%f", "The Energy Needed is:",q);
}
}
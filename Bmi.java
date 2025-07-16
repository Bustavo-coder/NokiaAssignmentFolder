import java .util.Scanner;
	public class Bmi {
		public static void main (String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Input Your weight in Kilograms");
	double userWeight = input.nextDouble();

	System.out.println("Input Your height in Inchies"); 
	double userHeight = input.nextDouble();

	double bmi = userWeight/(userHeight * userHeight);

	System.out.printf("%n%s %f", "Your Bmi is", bmi);
	
	if(bmi < 50){
		System.out.println("healthy");
	}
else {
	System.out.println("Not Healthy");
}


}
}
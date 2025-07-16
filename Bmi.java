import java.util.Scanner;
public class Bmi {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input Your weight in pounds:");

		double weight = input.nextDouble();
			
		System.out.println("Input Your Height meters:");
		double height = input.nextDouble();

		double weightTopounds = weight * 0.45359237;
		double heightTometers = height * 0.0254;

		double bmi = weightTopounds/(heightTometers*heightTometers);
		System.out.printf("%f%s", bmi, " is Your Body Mass Index");



		
}
}
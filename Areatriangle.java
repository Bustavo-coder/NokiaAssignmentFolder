 import java.util.Scanner;
public class Areatriangle {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Side1");
		 
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double side1 = x1 + y1;
		System.out.println(side1);
				 
		System.out.println("Enter Side2");

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double side2 = x2 + y2;
		

		System.out.println("Enter Side3");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double side3 = x3 + y3;
		

		double sad = (side1 + side2 + side3)/2;
		System.out.println(sad);

               double sum = sad *((sad-side1) * (sad-side2) * (sad-side3));
		sum = Math.sqrt(sum);
		System.out.println(sum);
		
			




		
}
}
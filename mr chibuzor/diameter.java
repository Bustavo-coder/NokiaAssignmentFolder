import java.util.Scanner;
	public class diameter {
	public static void main (String [] args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("Input The Radius Of The circle");
	
		int radius = input.nextInt();
		
	
		System.out.printf("%s %d %s %f %s %f%n", "The Diameter of the circle is", (2 * radius), "The  circumference is",(double) ( 2 * Math.PI* radius), 
		"And The Area is",(double) ( Math.PI * radius * radius));

	
}
}
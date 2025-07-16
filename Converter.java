import java.util.Scanner; 
	public class Converter{
	public static void main (String [] args) {
		
		Scanner insert = new Scanner(System.in);
		System.out.println("Enter Your Number in pounds");
		
		double input = insert.nextDouble();
		double converter = input * 0.454;

		System.out.printf("%f%s%f%s", input, " pounds Is " ,converter," Kilograms");

}
}
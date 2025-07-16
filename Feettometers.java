import java.util.Scanner ;
   public class Feettometers{
	public static void main (String [] args) {
		
		Scanner outer = new Scanner(System.in);
		System.out.println("Enter The Feet Value You want to convert");
		
		double feet = outer.nextDouble();
		double converter = (feet * 0.305);
		
		System.out.printf("%f%s%f%s", feet, "feet is ",converter," Meters");
		
}
}
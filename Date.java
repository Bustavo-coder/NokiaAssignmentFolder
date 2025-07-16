import java.util.Scanner;

	public class Date {
		public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount Minutes");

		int mInutes = input.nextInt();
		
		int years =  mInutes / 525600;
		int days = (mInutes % 525600 )/1440;
		System.out. printf("%d%s%d%s%d%s", mInutes,"minutes is approimately ",years,"years and ",days,"Days");
}
}
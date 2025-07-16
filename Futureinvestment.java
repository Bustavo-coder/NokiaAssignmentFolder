import java.util.Scanner;

	public class Futureinvestment {
		public static void main (String [] args) {

		Scanner invest = new Scanner(System.in);

		System.out.println("Enter Your Investment Amount");
		double investmentAmount = invest.nextDouble();
		
		System.out.println("Enter Your AnnualIntrest Amount");
		double anualIntrest = invest.nextDouble();

		System.out.println("Enter Your Amount Years");
		double amountOfyears = invest.nextDouble();
		
		double futureInvestmentValue = investmentAmount + (1 + anualIntrest) * amountOfyears;
		System.out.printf("%s%f", "Accumulated Value Is :" , futureInvestmentValue);
}
}
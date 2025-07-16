import java.util.Scanner;

public class Withdrawalstest {
	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		BankuserJourney user = new BankuserJourney();

// Set Username		
		System.out.println("Enter Your Fullname");
		String userName = input.nextLine();
		user.setName(userName);
	
// Set Password
		System.out.println("Enter Your Password (password must not be less than 10 charcter)");
		String setPassword = input.nextLine();
		user.setPassword(setPassword);

		
// Check if password lenght is greater than 10 password authorization
if(setPassword.length() >= 10){
		user.setPassword (setPassword);
		System.out.println("Password Sucessfully set up");
				
}else {
	System.out.println("Invalid password");
	setPassword = input.nextLine();
	user.setPassword (setPassword);
};
		
// Input Amount you want to deposit
		System.out.println("Input the amount you want to save");
		double userDeposit = input.nextDouble();
		user.setAccountBalance(userDeposit);
		
System.out.printf("%s%n", "Your Account Has Been Set Up Succesfuly");

// Input Amount you want to withdrawls
		System.out.println("Input the amount you want to withdrawls");
		double userWithdrawls = input.nextDouble();
		user.setWithdrawals(userWithdrawls);

// collect userPassword to check for user 
System.out.println("Input Your Password");
String pinAuthorization = input.nextLine();

// Checking if password is correct to withdrawl

// if(pinAuthorization.equals("")){
	if( user.getAccountBalance() >= user.getWithdrawals()){
		System.out.printf("%s%f%s","The Withdrawls of the sum of",user.getWithdrawals(),"is succesfully");
}else {
	System.out.print("Insufficient Funds!!!!");
}
}else{
	System.out.println("Incorrect Password");
}

	
}

}

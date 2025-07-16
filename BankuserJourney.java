public class BankuserJourney{
	public String name;
	public double accountBalance;
	public double withdrwals;
	public String password;
	
	public void setName(String name){
		this.name = name;
};
	public String getName(){
		return name;
};
	public void setPassword (String Password){
		this.password = password;
};
	public String getPassword (){
		return password;
	
};

	public void setAccountBalance (double accountBalance){
	this.accountBalance = accountBalance;
};

	public double getAccountBalance(){
		return accountBalance;
};

	public void setWithdrawals(double withdrwals){
		this.withdrwals =  withdrwals;
};

	public double getWithdrawals(){
		return  withdrwals;
};

	public double Withdrawals(double withdrawlas, double accountBalance) {
		double remainingBalance = accountBalance - withdrawlas;
		return remainingBalance;
};
	
}
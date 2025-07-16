import java.util.Scanner;
	public class Pallindium{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input 4 or 3 digits Number");
		int userInput = input.nextInt();
		 
	
	String userInput2 = userInput + "";
	if(userInput2.length() > 2) {

	if(userInput2.length() == 4){
	int lastNumber = userInput % 10;
	int thirdNumber = userInput % 100 / 10;
	int secondNumber = userInput % 100 / 10;
	int firstNumber = userInput / 1000;
	
	String tab = lastNumber+ "" + thirdNumber + "" + secondNumber + "" + firstNumber + "";
	if(userInput2.equals(tab)){
		System.out.println("It Is A pallendium");
	 }else{
	System.out.println("It Is not a pallendium");
	}

} 


  else if(userInput2.length() == 3){
		int lastNumber = userInput % 10;
		int secondNumber = userInput % 100 / 10;
		int firstNumber = userInput / 100;

	String tab = lastNumber+ "" + secondNumber + "" + firstNumber + "";
	if(userInput2.equals(tab)){
		System.out.println("It Is A pallendium");
	}
else{
	System.out.println("It Is not a pallendium");
}
}


}

else {
	System.out.println("Invalid Input");
}

}
}
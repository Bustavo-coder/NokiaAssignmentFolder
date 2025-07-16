import java.util.Scanner;

	public class Oddsndeven {
		public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the set of Numbers");

		System.out.println("Enter the first set of Numbers");
		int number1 = input.nextInt();
		System.out.println("Enter the Second of Numbers");
		int number2 = input.nextInt();
		System.out.println("Enter the third of Numbers");
		int number4 = input.nextInt();
		System.out.println("Enter the fifth of Numbers");
		int number5 = input.nextInt();
		System.out.println("Enter the sixth of Numbers");
		int number6= input.nextInt();
		System.out.println("Enter the seventh of Numbers");
		int number7 = input.nextInt();
			
		int even = 0;
		int odd = 0;
		int divident = 2;
		

	if(number1 % divident == 0){
		even = (number1  + even);
}else {
	odd = number1 + odd;
};


	
	if(number2 % divident == 0){
		even = (number2  + even);
}else {
	odd = number2 + odd;
};


	
	if(number4 % divident == 0){
		even = (number4  + even);
}else {
	odd = number4 + odd;
};


	
	if(number5 % divident == 0){
		even = (number5  + even);
}else {
	odd = number5 + odd;
};

	if(number6 % divident == 0){
		even = (number6  + even);
}else {
	odd = number6 + odd;
};



	if(number7 % divident == 0){
		even = (number7  + even);
}else {
	odd = number7 + odd;
};





 
 
 
 
	System.out.printf("%s%d%n", "The sum of even: ",even);
	System.out.printf("%s%d%n", "The sum of odd: ",odd);
}
}
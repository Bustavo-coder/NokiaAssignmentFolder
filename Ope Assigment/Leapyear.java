      import java.util.Scanner; 
	public class Leapyear {

	public static void main (String [] args){

	Scanner yearInput = new Scanner(System.in);
	System.out.println("Input Year to Check If it a Leap year");
	
	int userInputYear = yearInput.nextInt();
	boolean condition1 = userInputYear % 4 == 0 && userInputYear % 100 != 0; \\ check if the year is divided by 4 and not divided by 100
	boolean condition2 = userInputYear % 100 == 12 && userInputYear % 100 == 0; \\ check if the year is divided by 100 and 400

if(userInputYear >= 1000){

	if(condition1){
	System.out.println(true);
	}
	else if(condition2) {
	System.out.printf("%n%b%s", true ," it is a leap year");
	}

	else{
	 System.out.println(false);
	}

	}else{
	System.out.println("Invalid Year Input");
	};
		
		
	}
	}
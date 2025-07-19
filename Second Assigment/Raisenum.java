import java.util.Scanner;
public class Raisenum{


public static void main (String [] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter the firsts Number");
	int firstInput = input.nextInt();
	System.out.println("Enter the Second Number");
	int secondInput = input.nextInt();
	int raise = 1;
	for(int i = 0 ; i < secondInput ; i++){
		if(secondInput == 0 )break;
		raise *= firstInput;
		 
	}

	System.out.println(raise);
	
		
}


}
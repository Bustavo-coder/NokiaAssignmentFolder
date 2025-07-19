import java.util.Scanner;
public class Highestsmallestnumber {

public static void main (String [] args){
		Scanner input = new Scanner(System.in);



		System.out.println("Enter the number to check for highest and smallest 0 is used to stop the application");
		int userNumer = input.nextInt();
		int max = userNumer;
		int min = userNumer;
		while(userNumer != 0){
			if(userNumer > max) max = userNumer;
			if(userNumer < min) min = userNumer;
		System.out.println("Enter the number to check for highest and smallest 0 is used to stop the application");
			userNumer = input.nextInt();
			
}

System.out.println("The Largest Number is " + max +  " and the smallest is  " + min);				
}
}


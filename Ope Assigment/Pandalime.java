import java.util.Scanner;
	public class Pandalime{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input any digits to check if it is a pandalime");

		System.out.println("Input 4 digits");
		String userInput = input.nextLine();
		
		String tab = "";
\\ looping backwards to arrrange the userinput from the back
		for(int i = userInput.length()-1; i >= 0; i--){
			 tab =  tab + userInput.charAt(i);
\\ concatinating Each charcter to make a full string
		         		
}; 
	 System.out.println(tab);

	if(userInput.equalsIgnoreCase(tab)){

	System.out.println("It Is A palliedum");
}
else{
	System.out.println("It is Not a palledium");
};	
}
}




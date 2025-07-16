import java.util.Scanner;
public class multiply {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number from 1-5 to get the square of the number");
		int squaredNumber = input.nextInt();
		

if(squaredNumber == 1){
	System.out.println(1);
	
}else if(squaredNumber == 2){
	System.out.println(1 + 3);
}else if(squaredNumber == 3){
	System.out.println(1 + 3 + 5);
}else if(squaredNumber == 4){
	System.out.println(1 + 3 + 5 + 7);
}else if(squaredNumber == 5){
	System.out.println(1 + 3 + 5 + 7 + 9);
}else{
	System.out.println("Invalid input");
};
		
}
}
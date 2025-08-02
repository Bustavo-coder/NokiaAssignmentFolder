import java.util.Scanner;
import java.util.Arrays;
public class Duplicateclass{
	public static void main (String [] args){
	int [] check = {6,5,4,2,2,1};

	int [] store =  checkRepetitive(check);
	System.out.println(Arrays.toString(store));
	
}	




	public static int [] checkRepetitive(int [] intialArray){
		int value = intialArray.length;   
		int [] returnedArray = new int [value];
		boolean index = true;
	

		for(int count = 0; count < value; count++){
			int number1 = intialArray[count];

			for(int counter = 0; counter < value;counter++){
				int number2 = intialArray[counter];
			if(count ==  counter) continue;
			if(number1 == number2) index = false;
					}
			if(index) returnedArray[count] = number1 ;
				}
				return returnedArray;
			}

}
		



import java.util.Arrays;
public class HighestLowest{
	public static void main (String [] args){
		
		int [][] values = {{70,60},{80,90},{100,50}};
		//int largest =  values [0][0] ;
		//int smallest =  values [0][0] ;
		//int [] ranges = new int[2];
		System.out.print(Arrays.toString(getHighest(values)));
	


	}


public static int [] getHighest(int [] [] values){
		int largest =  values[0][0];
		int smallest =  values[0][0];
	for(int count = 0; count < values.length; count++){
		for(int counter = 0; counter < values[count].length; counter++){
			if(values[count][counter] > largest) largest = values[count][counter];
			if(values[count][counter] < smallest) smallest = values[count][counter];
			
		}
	}

	int [] highestSmallest  = {largest,smallest};
	return highestSmallest;
	
	}
		
}





//for(int number[]: values){
		//for(int innerNumb : number){
			//if(innerNumb > largest) largest = innerNumb;
			//if(innerNumb  < smallest) smallest = innerNumb ;
		//}
			
	//}
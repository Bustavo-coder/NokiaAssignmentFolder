import java.util.Scanner;
public class Duplicate{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Amount of Numbers");
		int arraylen = input.nextInt();
		
		System.out.print("Enter The Number You Want to check repittion\n");
		int num = input.nextInt();

		int [] setOfNumbers = new int [arraylen];
		for(int counter = 0; counter < setOfNumbers.length;counter++){
			System.out.println("Enter The Set of Numbers");
			setOfNumbers[counter] = input.nextInt();	
			}

  
			System.out.println(getRepitition(num,setOfNumbers));
		
	}
	


	public static int getRepitition(int num, int [] numbersArray){
		int totalRepitititon = 0;
			for(var i = 0; i < numbersArray.length;i++){
			if(num == numbersArray[i]) totalRepitititon++;
				}
			return totalRepitititon;
				}
			
			}	
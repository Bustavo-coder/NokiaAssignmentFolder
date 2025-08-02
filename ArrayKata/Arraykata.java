public class Arraykata{


	public static int maximumInt(int [] setOfNumbers){
		int largest = setOfNumbers[0];

		for(int count = 0; count <setOfNumbers.length;count++){
			if(setOfNumbers[count] > largest) largest = setOfNumbers[count];
		}

		return largest;
		
	}

	public static int minimumInt(int [] setOfNumbers){

		int lowest = setOfNumbers[0];
		for(int count = 0; count < setOfNumbers.length;count++){
			if(setOfNumbers[count] < lowest) lowest = setOfNumbers[count];

		}
		return lowest;


	}

	public static int sumOf(int [] setOfNumbers){
		int sum = 0;
		for(int count = 0; count < setOfNumbers.length;count++){
			sum += setOfNumbers[count];

			}
			
		return sum;

		}
	public static int sumOfEvenNumbersIn(int [] setOfNumbers){

		int  sumOfEvenNumbersIn = 0;
		for(int count = 0; count < setOfNumbers.length;count++){
			if(setOfNumbers[count] % 2 == 0) sumOfEvenNumbersIn +=setOfNumbers[count];
		}

		return sumOfEvenNumbersIn;

	}


	public static int sumOfOddIn(int [] setOfNumbers){

		int   sumOfOddIn = 0;
		for(int count = 0; count < setOfNumbers.length;count++){
			if(setOfNumbers[count] % 2 == 1) sumOfOddIn+=setOfNumbers[count];
		}

		return sumOfOddIn;

	}


	public static int [] minimumAndMaximumOf(int [] setOfNumbers){

		int lowest = setOfNumbers[0];
		int largest = setOfNumbers[0];
		for(int count = 0; count < setOfNumbers.length;count++){
			if(setOfNumbers[count] < lowest) lowest = setOfNumbers[count];
			if(setOfNumbers[count] > largest) largest = setOfNumbers[count];

		}
		int minimumandMaximum[] = {largest , lowest};
		return  minimumandMaximum;


	}

	public static int numberOfOdds(int [] setOfNumbers){
		int numbersOfOddIn = 0;
		for(int count = 0; count < setOfNumbers.length;count++){
			if(setOfNumbers[count] % 2 == 1) numbersOfOddIn+=1;
		}

		return numbersOfOddIn;
		

	}

	public static int numberOfeven(int [] setOfNumbers){
		int numbersOfEven = 0;
		for(int count = 0; count < setOfNumbers.length;count++){
			if(setOfNumbers[count] % 2 == 0) numbersOfEven+=1;
		}

		return numbersOfEven;
		

	}


	public static int [] numberOfevenIN(int [] setOfNumbers){
		int newArraylen = setOfNumbers.length;
		int [] numbersOfEven = new int[newArraylen];
		for(int count = 0; count < setOfNumbers.length;count++){
			if(setOfNumbers[count] % 2 == 0) numbersOfEven[count] = setOfNumbers[count];
		}

		return numbersOfEven;
		

	}

	public static int [] numberOfodds(int [] setOfNumbers){
		int newArraylen = setOfNumbers.length;
		int [] numbersOfodds = new int[newArraylen];
		for(int count = 0; count < setOfNumbers.length;count++){
			if(setOfNumbers[count] % 2 == 1)  numbersOfodds[count] = setOfNumbers[count];
		}	

		return numbersOfodds;
		

	}



	public static int [] squaresNumbers(int [] setOfNumbers){
		//int newArraylen = setOfNumbers.length;
		//int [] squaresNumbers = new int[newArraylen];
		for(int count = 0; count < setOfNumbers.length;count++){
			setOfNumbers[count] = setOfNumbers[count] * setOfNumbers[count];
			
		}	

		return setOfNumbers;
		

	}
	


}
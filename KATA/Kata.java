public class Kata{

public static boolean isEven(int userInput){
	boolean resPonse = userInput % 2 == 0;
	return resPonse;
}





public static int subTraction(int userInput1,int userInput2){
	
	int rePonse = userInput1 - userInput2;
	if(rePonse  < 0) rePonse  = rePonse * - 1;
	return rePonse;

}


public static float divide (int userInput1 ,int userInput2){
	
	float divideNum = (float) userInput2 == 0 ? 0 :(userInput1 / userInput2);
	return divideNum;
}




public static int factorOf (int userInput){
	int sumOfFactors = 0;
	for(var i = 1 ; i < userInput + 1 ; i++){

	if(userInput % i == 0) sumOfFactors++;

}
	return sumOfFactors;
}



public static boolean getPallidium (int userInput){
	String changeToString = userInput + "";
	String reversedUserInput = "";

	for(var i = changeToString.length() - 1; i >= 0; i--){
	reversedUserInput += changeToString.charAt(i);
}
boolean resPonse = reversedUserInput.equals(changeToString);
return resPonse;
}


public static long factorial(long useinput){
	
	long factorialValue = 1;
	for(long i = useinput ; i > 0; i--){

	factorialValue *= i;
}
	if(useinput < 0)factorialValue = 0;
	return factorialValue;
}

public static int squareOf (int userInput){
	int sqaure = userInput * userInput;
	return sqaure;

}


}
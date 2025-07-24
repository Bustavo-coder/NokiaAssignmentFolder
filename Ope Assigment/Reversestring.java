public class Reversestring{	

	public static int loopString(String word, char ch){

	 int index = 0;
	for(int i = 0 ; i < word.length();i++){
	if(word.charAt(i) == ch){
	index = i;
	break;
	}

	}
	return index;

}


public static String printReversed(int indexOf,String word){
	String reversed = "";

	for(int j = indexOf; j >= 0; j--){
	 reversed += word.charAt(j);
	}
	
	return reversed;
	
}

public static String printFoward(int indexOf,String word){
	String remain = "";

	for(int j = indexOf + 1; j < word.length() ; j++){
	 remain += word.charAt(j);
	}
	
	return remain;
	
}





}
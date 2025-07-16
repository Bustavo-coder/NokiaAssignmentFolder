import java.util.Scanner;
public class Consonant {
	public static void main (String [] arg){
	Scanner alphabeth = new Scanner(System.in);

	System.out.println("Input Your Alphabeth");
	 char userAlphabeth = alphabeth.next().charAt(0);

	if(Character.isLetter(userAlphabeth)){
		 String compare = userAlphabeth + "";
		if(compare.equalsIgnoreCase("A") || compare.equalsIgnoreCase("e") || compare.equalsIgnoreCase("i") || compare.equalsIgnoreCase("o") || compare.equalsIgnoreCase("u")){
		System.out.printf("%s %s", userAlphabeth, "Letter Is vowel");
	}
	else{
	System.out.printf("%s %s", userAlphabeth , "Letter Is A consonant");
	}
}else{
	System.out.printf("%s %s", userAlphabeth ,"Is Invalid");
}
	
}
}


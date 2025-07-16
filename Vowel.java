import java.util.Scanner;
 public class Vowel {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);

		System.out.println("Enter The Character between a to z");
		 char userAlphabelth = input.next().charAt(0);

		if (Character.isLetter(userAlphabelth)){
		if(userAlphabelth == 'A' || userAlphabelth == 'a'){
			System.out.printf("%c %s", userAlphabelth, "Is A vowel");
 }

	else if (userAlphabelth == 'E' || userAlphabelth == 'e'){
			System.out.printf("%c %s", userAlphabelth, "Is A vowel");
 }
	else if (userAlphabelth == 'I' || userAlphabelth == 'i'){
			System.out.printf("%c %s", userAlphabelth, "Is A vowel");
 }
	else if (userAlphabelth == 'O' || userAlphabelth == 'o'){
			System.out.printf("%c %s", userAlphabelth, "Is A vowel");
 }
	else if (userAlphabelth == 'u' || userAlphabelth == 'U'){
			System.out.printf("%c %s", userAlphabelth, "Is A vowel");
 }


	else {
		System.out.printf("%c %s", userAlphabelth, "is a consonant");
};
}else {
		System.out.println("Invalid User Input");
}

}
}

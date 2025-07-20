import java.util.Scanner;
public class phoneBookSwitcher {

	public static void phoneBookMenu(){
		Scanner inputCollector = new Scanner(System.in);
		System.out.println(
		

		"""



		1->.Search
		2->.Service Nos
		3->. Add Name
		4->. Erase
		5->. Edit
		6->.Assign tone
		7->.send b'card
		8->.Options
		9->.Speed Dials
		10->.Voice Tags
		0.--> To Exit
		
		""");
	int input2;
		do{
	System.out.println("Enter to go to Phonebook options");
	input2 = inputCollector.nextInt();
	if(input2 != 0){
	switch(input2){
	case 8 : System.out.print(
		"""
		1.-> Type of view
		2.-> Memeory Tasks

		""");
		break;
case 1 : System.out.print(
		"""
		1-> Search

		""");break;

case 2 : System.out.print(
		"""
		2-> Service Nos

		""");
break;
case 3 : System.out.print(
		"""
		4-> Add Name

		""");
break;
case 4 : System.out.print(
		"""
		4-> Erase

		""");
break;
case 5 : System.out.print(
		"""
		5-> Edit

		""");
break;
case 6 : System.out.print(
		"""
		6-> Assign Tone

		""");
break;
case 7 : System.out.print(
		"""
		7-> Send b'Card

		""");
break;
case 9 : System.out.print(
		"""
		9-> Speed Dials

		""");
break;
case 10 : System.out.print(
		"""
		1-> voice Tags

		""");break;
default : System.out.println("Incorrect Input");

}
	System.out.println("Enter 00 to go back to PhoneBook menu");
	int goBack = inputCollector.nextInt();
	System.out.println(
		

		"""
		1->.Search
		2->.Service Nos
		3->. Add Name
		4->. Erase
		5->. Edit
		6->.Assign tone
		7->.send b'card
		8->.Options
		9->.Speed Dials
		10->.Voice Tags
		0.--> To Exit
		00.--> To Go Back to PhoneBook Menu
		
		""");


	};
	}while(input2 != 0);
}



}


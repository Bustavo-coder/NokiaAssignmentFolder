import java.util.Scanner;
public class Nokia {
public static void main(String [] args){
	Scanner inputCollector = new Scanner (System.in);

System.out.println
		("""





		Welcome to Nokia 3310 Where we help you to
		Welcome Welcome 




		1.-> Phone Book
		2.-> Message
		3.-> Chat
		4.-> Call Register
		5.->Tone
		6.-> Settings
		7.-> Call Divert
		8.-> Games
		9.-> Calculator
		10.-> Remainder
		11.-> Clock
		12.-> Profile
		13.-> SIM Service
			

	""");
		int input;
	do{
	System.out.println("Enter a option");
	input = inputCollector.nextInt();
	if(input != 14){

	switch(input){
case 1 : 
phoneBookSwitcher.phoneBookMenu();
break;
case 2 :Messageswitcher.messageMenu();
	break;
case 3 :System.out.println("Chat");
break;

case 4 : Callsettingsswitcher.callRegisterMenu();
	break;
case 5 :  RingingtoneSwitcher.ringingToneMenu();
break;	

case 6 : Settings.mainSettings();
break;


case 7 : System.out.println("""
	Call Divert
""");
	break;	

case 8 : System.out.println("""
	Gamea
""");
break;	


case 10 : System.out.println("""
	Reminders
""");
break;

case 11 :Clocksswitcher.clockSwitch();
break;
case 12 : System.out.println("""
	Profiles
""");
break;
case 13 : System.out.println("""
	Sim Services
""");
break;
default : 
	System.out.println("""
	Invalid Inputs
""");
}
	System.out.println("Enter 00 to go back to Nokia Main Menu");
	 int nokiaInput = inputCollector.nextInt();
	System.out.println
		("""
		1.-> Phone Book
		2.-> Message
		3.-> Chat
		4.-> Call Register
		5.->Tone
		6.-> Settings
		7.-> Call Divert
		8.-> Games
		9.-> Calculator
		10.-> Remainder
		11.-> Clock
		12.-> Profile
		13.-> SIM Service
		14.--> To Switch off	

	""");

}else{
	System.out.println("Switching Off");
}

}while(input != 14);	

		
}
}
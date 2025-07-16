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

	System.out.println("Enter a option");
	int input = inputCollector.nextInt();


	switch(input){
		case 1 : 
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
		""");
	System.out.println("Enter 8 to see other options");
	int input2 = inputCollector.nextInt();
	switch(input2){
	case 8 : System.out.print(
		"""
		1.-> Type of view
		2.-> Memeory Tasks

		""");
}
break;

case 2 : 
		System.out.println(


		"""
		1->.Write Messages
		2->.Inbox
		3->. Outbox
		4->. Picture Messages
		5->. Templates
		6->.Smileys
		7->.Mesage Settings
		8->.Info Services
		9->.Voice Mailbox
		10->.Service command editor
		""");
		System.out.println("Enter 7 for Message Settings");
		int inputMessageSetting = inputCollector.nextInt();
		switch(inputMessageSetting){
			case 7 : System.out.println(
				"""
				1-> Set 1
				2-> Common
				""");
		System.out.println("Choose Option");
		int inputsetCommon = inputCollector.nextInt();
		switch(inputsetCommon){
		case 1 : System.out.println("""
			1->.Message Center Number
			2->.Message Sent as
			3->.Message Validity
				""");
			break;
		case 2 : System.out.println("""
			1->.Delivery reports
			2->.Reply via same Center
			3->.Character Support
				""");
		default : System.out.println("""
			Invalid Choosing
				""");	
		}
			
}
	break;
	case 3 : 
		System.out.println("Chat");
			break;

	case 4 :

		
		System.out.println(


		"""
	4->.Call Register
		1->.Missed call
		2->. Dialled numbers
		3->. Erase recent calls
		4->. Show call duration
		5->.Show Call cost
		6->.Call Cost settings
		7->.Prepaid Credits
				""");
	System.out.println("Choose from 5,6,7 for more options");
	int chooseFivesixSeven = inputCollector.nextInt();
	switch(chooseFivesixSeven){
		case 5 : System.out.println(
			"""
		1->.Last call duration
		2->. All Calls duaration
		3->. Received Calls duration
		4->. Dialled Calls duration
		5->.Clear Timers
			""");
	break;

case 6 : System.out.println(
			"""
		1->.Last call Costs
		2->. All Calls Costs
		3->. Clear Counters
					""");
	break;
case 7 : System.out.println(
			"""
		1->.Call Cost Limits
		2->. Show Costs in
				""");
	break;
default: System.out.println("Invalid Options");

} 
break;
case 5 : {
		System.out.println(


		"""
	1->.Ringing Tones
		1->.Ringing tone
		2->. Ringing Volume
		3->. Incomig call alert
		4->. Keyad tonnes
		5->.composer
		6->.Warning and games tonnes
		7->.vibrating alert
		8->.Screen Saver
		9->.Message Alerts tone
		""");
}
break;	

	case 6 : 
		System.out.println(
		"""
	1->.Settings
		1->.Call Settings
		2->. Phone Settings
		3->. Security Settings
		4->. Restore Factory Settings
				""");
	System.out.println("Enter an options from  1,2,3,4");
	int inputSettings  = inputCollector.nextInt();
	switch(inputSettings) {
		case 1 : 
			System.out.println(
		"""
	1->. Call Settings
		1->.Automatic Redial
		2->. Speed Dialing
		3->. Call Waiting options
		4->. Own number sendings
		5->.Phone Line in use
		2->. Automatic Answer
		
				""");
		break;

case 2 : 
			System.out.println(
		"""
	2->. Phone Settings
		1->.Language
		2->. Cell info display
		3->. Welcome note
		4->. Network Selection
		5->.Lights
		2->. Confirm Sim service actions
		
				""");
		break;
case 3 : 
			System.out.println(
		"""
	1->.Security Settings
		1->.Pin code requests
		2->. Call barring service
		3->. Fixed Dialling
		4->. Closed user group
		5->.Phone Security
		2->. Change Access Code
		
				""");
		break;
case 4 : 
			System.out.println(
		"""
	1->.Restore Factory Settings
			
		""");
 	break;
default : System.out.print("Invalid User Input");
}
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

case 11 : System.out.println("""
	Clock Wise
""");
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
}
}
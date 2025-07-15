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
		6.-> Settingss
		7.-> Call Divert
		8.-> Games
		9.-> Calculator
		10.-> Remainder
		11.-> Clock
		12.-> Profile
		13.-> SIM Service
		14.-> Exit
			

	""");
		
	int input;
	do{

	
	System.out.println("Enter a option");
	input = inputCollector.nextInt();

	if(input != 14){
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
		0->.Menu
		
		""");
	int input2;
	do{
	System.out.println("Enter to see other options");
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

		""");break;
case 3 : System.out.print(
		"""
		4-> Add Name

		""");break;
case 4 : System.out.print(
		"""
		4-> Erase

		""");break;
case 5 : System.out.print(
		"""
		5-> Edit

		""");break;
case 6 : System.out.print(
		"""
		6-> Assign Tone

		""");break;
case 7 : System.out.print(
		"""
		7-> Send b'Card

		""");break;
case 9 : System.out.print(
		"""
		9-> Speed Dials

		""");break;
case 10 : System.out.print(
		"""
		1-> voice Tags

		""");break;
default : System.out.println("Incorrect Input");

}
System.out.println("Enter 00 to go back to PhoneBook menu");
int zeroZero = inputCollector.nextInt();
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
		0->.Exit
		
		""");
	
}
}while(input2 != 0);
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
		0->.Exit
		""");
			int inputMessageSetting;
		do{
		System.out.println("Enter for Message Settings");
		inputMessageSetting = inputCollector.nextInt();
			if( inputMessageSetting !=0){
		switch(inputMessageSetting){
		case 1 :System.out.println("1--> Write Messages");
			break;
		case 2 :System.out.println("2--> Inbox");
			break;
		case 3 :System.out.println("3--> Outbox");
			break;
		case 4 :System.out.println("4--> Picture Messgaes");
			break;
		case 5 :System.out.println("5--> Templates");
			break;
		case 6 :System.out.println("6--> Smileys");
			break;
		
		case 8 : System.out.println("Info Service");
			break;
		case 9 : System.out.println("Voice Mailbox");
				break;
		case 10 : System.out.println("Service Command Editor");
			break;
		case 7:System.out.println("7--> Write Messages");
		 System.out.println(
				"""
				1-> Set 1
				2-> Common
				""");
			int inputMessageSetting2 = 0;
		do{
		System.out.println("Enter options Message Settings");
		 inputMessageSetting2 = inputCollector.nextInt();
			if(inputMessageSetting2 != 0) {
		switch(inputMessageSetting2){
		case 1 : System.out.println("""
			1->.Message Center Number
			2->.Message Sent as
			3->.Message Validity
				""");
			System.out.println("Enter messaging options");
			int messagingOptions =  inputCollector.nextInt();
			switch(messagingOptions){
			case 1 : System.out.println("""
				1->.Message Center Number
				""");
				break;
			case 2 : System.out.println("""
				2->.Message Sent as
				""");
				break;
			case 3 : System.out.println("""
				2->.Message Validity
				""");
				break;
			default : System.out.println("""
				2->.Invalid Input
				""");
				break;	
			}
			break;
		case 2 : System.out.println("""
			1->.Delivery reports
			2->.Reply via same Center
			3->.Character Support
				""");
			
		System.out.println("Enter delivery options");
			int deliveryOptions=  inputCollector.nextInt();
			switch(deliveryOptions){
			case 1 : System.out.println("""
				1->.Delivery reports
				""");
				break;
			case 2 : System.out.println("""
				2->.Reply via same Center
				""");
				break;
			case 3 : System.out.println("""
				2->.Character Support
				""");
				break;
			default : System.out.println("""
				2->.Invalid Input
				""");
				break;	
			}
			break;
			default : System.out.println("""
			Invalid Choosing
				""");	
		}
			System.out.println("Enter 00 to go back to Set and common Menu");
			int zeroOne = inputCollector.nextInt();
		}
		 System.out.println(
				"""
				Returning To Sub Menu
				1-> Set 1
				2-> Common
				0-> To Exit
				""");
		} while(inputMessageSetting2  != 0);
		break;

			}
				System.out.println("Enter 00 to go back to message Setting Menu");
				int zeroOneMain = inputCollector.nextInt();
			}
			System.out.println(


		"""
		Returning to Main Menu
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
		0->.Exit
		""");
			}while(inputMessageSetting !=0);
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
		0->.Exit
				""");
		int chooseFivesixSeven = 0;
		do{
	System.out.println("Choose for more options");
	 chooseFivesixSeven = inputCollector.nextInt();
	if(chooseFivesixSeven != 0){
	switch(chooseFivesixSeven){
		case 1 :System.out.println("Missed Call");
			break;
		case 2 :System.out.println("Dialled Call");
			break;
		case 3 :System.out.println("Erase recent calls");
			break;
		case 4 :System.out.println("Show call duration");
			break;
		case 5 : System.out.println(
			"""
		1->.Last call duration
		2->. All Calls duaration
		3->. Received Calls duration
		4->. Dialled Calls duration
		5->.Clear Timers
			""");
		int callDurations = 0;
		do {
		System.out.println("Choose for more options");
		callDurations = inputCollector.nextInt();
		if(callDurations != 0){
		switch(callDurations){
		case 1 :System.out.println("Last call duration");
			break;
		case 2 :System.out.println("All Calls duaration");
			break;
		case 3 :System.out.println("Received Calls duration");
			break;
		case 4 :System.out.println("Dialled Calls duration");
			break;
		case 5 :System.out.println("Clear Timers");
			break;
		default :System.out.println("Invalid out");
		}
			System.out.println("Enter 00 to go back to clear Timers Menu");
			int zeroOne = inputCollector.nextInt();
		}
			 System.out.println(
			"""
		1->.Last call duration
		2->. All Calls duaration
		3->. Received Calls duration
		4->. Dialled Calls duration
		5->.Clear Timers
		0->.To Exit
			""");
		}while(callDurations != 0);
		
		break;

case 6 : System.out.println(
			"""
		1->.Last call Costs
		2->. All Calls Costs
		3->. Clear Counters
					""");
		
		int callCosts = 0;
		do{
		System.out.println("Choose for more options");
		callCosts = inputCollector.nextInt();
		if(callCosts != 0){
		switch(callCosts){
		case 1 :System.out.println("Last call costs");
			break;
		case 2 :System.out.println("All Calls Cost");
			break;
		case 3 :System.out.println("Clear Counter");
			break;
		default :System.out.println("Invalid out");
				
		}
		System.out.println("Enter 00 to go back to call cost menu");
		int zerosixMenu = inputCollector.nextInt();
		} System.out.println(
			"""
		1->.Last call Costs
		2->. All Calls Costs
		3->. Clear Counters
		0->.0 to exit
			""");
		} while(callCosts != 0);
	break;
case 7 : System.out.println(
			"""
		1->.Call Cost Limits
		2->. Show Costs in
		0->. 0 to exit
		
		""");
		int callLimits = 0;
		do{
		System.out.println("Input your otions");
		callLimits = inputCollector.nextInt();
		if(callLimits != 0) {
		switch(callLimits){
		case 1 :System.out.println("Call Cost Limit");
			break;
		case 2 :System.out.println("Show Cost In");
			break;
		default :System.out.println("Invalid out");
				
				}
				System.out.println("Enter 00 to go back to Cost settings menu");
				int zerofour = inputCollector.nextInt();
				}
				System.out.println(
			"""
		1->.Call Cost Limits
		2->. Show Costs in
		0->.To Exit
				""");
				}while(callLimits != 0);

			
	break;
default: System.out.println("Invalid Options");
}
			System.out.println("Enter 00 to go back to call register menu");
			int zerofive = inputCollector.nextInt();
}
System.out.println(

		"""
	4->.Sub-Menu
		1->.Missed call
		2->. Dialled numbers
		3->. Erase recent calls
		4->. Show call duration
		5->.Show Call cost
		6->.Call Cost settings
		7->.Prepaid Credits
		0->.Exit
				""");

} while(chooseFivesixSeven != 0);

	break;

case 5 : 
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
		int ringingTones = 0;
		do{
		System.out.println("Choose for more options");
		ringingTones = inputCollector.nextInt();
		if(ringingTones != 0){
		switch(ringingTones){
		case 1 :System.out.println("Ringing tone");
			break;
		case 2 :System.out.println("Ringing Volume");
			break;
		case 3 :System.out.println("Incomig call alert");
			break;
		case 4 :System.out.println("Keyad tonnes");
			break;
		case 5 :System.out.println("composer");
			break;
		case 6 :System.out.println("Warning and games tonnes");
			break;
		case 7 :System.out.println("vibrating alert");
			break;
		case 8 :System.out.println("Screen Saver");
			break;
		case 9 :System.out.println("Message Alerts tone");
			break;
				}
		System.out.println("Enter 00 TO Go Back to menu");
		int zeroSeven = inputCollector.nextInt();
		}
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
		}while(ringingTones != 0);
		break;	

	case 6 : 
		System.out.println(
		"""
	1->.Settings
		1->.Call Settings
		2->. Phone Settings
		3->. Security Settings
		4->. Restore Factory Settings
		4->. 0 to exit
				""");
	int inputSettings = 0;
	do{
	System.out.println("Enter an options from  1,2,3,4");
	inputSettings  = inputCollector.nextInt();
	if(inputSettings != 0){
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
		6->. Automatic Answer
		
				""");
		int optionSettings = 0;
		do{
		System.out.println("Enter an options");
		 optionSettings  = inputCollector.nextInt();
		if(optionSettings != 0){
		switch( optionSettings){
		case 1 :System.out.println("1->.Automatic Redial");
			break;
		
		case 2 :System.out.println("3->Speed Dialing");
			break;
		case 3 :System.out.println("4->Call Waiting options");
			break;
		case 4 :System.out.println("5->Own number sendings");
			break;
		case 5 :System.out.println("6->Phone Line in use");
			break;
		
		case 6 :System.out.println("8-> Automatic Answer");
			break;
		default:System.out.println("Invalid Selection");
					}
			System.out.println("Enter 00 to go back to menu");
			int zeroNine = inputCollector.nextInt();
			System.out.println(
		"""
	1->. Call Settings
		1->.Automatic Redial
		2->. Speed Dialing
		3->. Call Waiting options
		4->. Own number sendings
		5->.Phone Line in use
		6->. Automatic Answer
		
				""");
			}
			
			}while(optionSettings != 0);
	
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
		int phoneSettings = 0;
		do{
		System.out.println("Enter an options");
		if(phoneSettings != 0){
		phoneSettings  = inputCollector.nextInt();
		switch( phoneSettings){
		case 1 :System.out.println("1->.Language");
			break;
		case 2 :System.out.println("2->Cell info display");
			break;
		case 3 :System.out.println("3->Welcome note");
			break;
		case 4 :System.out.println("4->Network Selection");
			break;
		case 5 :System.out.println("5->Lights");
			break;
		case 6 :System.out.println("6->Confirm Sim service actions");
			break;
		default:System.out.println("Invalid Selection");
					}
		System.out.println("Enter 00 to go back to menu");
		int zeroTen = inputCollector.nextInt();
		System.out.println(
		"""
	
		1->.Language
		2->. Cell info display
		3->. Welcome note
		4->. Network Selection
		5->.Lights
		2->. Confirm Sim service actions
		
		""");
		
	
		}
		
		}while(phoneSettings != 0);
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
		6->. Change Access Code
		
				""");
		int securitySettings = 0;
		do{
		System.out.println("Enter an options");
		securitySettings  = inputCollector.nextInt();
		if(securitySettings != 0){
		switch( securitySettings){
		case 1 :System.out.println("1->.Pin code requests");
			break;
		case 2 :System.out.println("2->Call barring service");
			break;
		case 3 :System.out.println("3->Fixed Dialling");
			break;
		case 4 :System.out.println("4->Closed user group");
			break;
		case 5 :System.out.println("5->Phone Security");
			break;
		case 6 :System.out.println("6->Change Access Code");
			break;
		default:System.out.println("Invalid Selection");
					}
		System.out.println("Enter 00 to go back to main menu");
		int zeroThird = inputCollector.nextInt();
		System.out.println(
		"""
		
		1->.Pin code requests
		2->. Call barring service
		3->. Fixed Dialling
		4->. Closed user group
		5->.Phone Security
		6->. Change Access Code
		
				""");
					}
		
			}while(securitySettings != 0 );
					break;
					
			
case 4 : 
		System.out.println(
		"""
	1->.Restore Factory Settings
		""");


 	break;
	default : System.out.print("Invalid User Input");
	}
		System.out.println("Enter 00 to go back to menu");
	int zeroSeven = inputCollector.nextInt();
	System.out.println(
		"""
	
		1->.Call Settings
		2->. Phone Settings
		3->. Security Settings
		4->. Restore Factory Settings
				""");
		}
	
	
	}while(inputSettings != 0);
		break;


case 7 : System.out.println("""
	7-->Call Divert
""");
	break;	

case 8 : System.out.println("""
	8--> Game
""");
break;	


case 10 : System.out.println("""
	10-->Reminders
""");
break;
case 11 : System.out.println("""
	 1--> Clock Wise
		1->.Alarm Clock
		2->Clock Setings
		3->Stopwatch
		4->Counter Timer
		5->Date Setings
		6->Auto Update date and time
	""");
int clocksWise = 0;
do{
System.out.println("Enter clockwise options");
clocksWise  = inputCollector.nextInt();
if(clocksWise != 0){
switch(clocksWise){
		case 1 :System.out.println("1->.Alarm Clock ");
			break;
		case 2 :System.out.println("2->Clock Setings ");
			break;
		case 3 :System.out.println("3->Stopwatch");
			break;
		case 4 :System.out.println("4->Counter Timer");
			break;
		case 5 :System.out.println("5->Date Setings");
			break;
		case 6 :System.out.println("6->Auto Update date and time");
			break;
		default:System.out.println("Invalid Selection");
					}
		System.out.println("Enter 00 to go back to clockwise Menu");
		int zeroClockwise = inputCollector.nextInt();
		System.out.println("""
		 0--> To Exit Clockwise Menu
		1->.Alarm Clock
		2->Clock Setings
		3->Stopwatch
		4->Counter Timer
		5->Date Setings
		6->Auto Update date and time
	""");
					}
					}while(clocksWise != 0);
break;




case 12 : System.out.println("""
	12-->Profiles
""");
break;
case 13 : System.out.println("""
	13-->Sim Services
""");
break;
default :System.out.println("Invalid Input");
}

System.out.println("Enter 00 to go back to Nokia Menu");
int zeroNine = inputCollector.nextInt();
System.out.println
		("""





	Enter 14 to exit or pick more Options

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
		14.-> Exit
			

	""");
}else System.out.println("Switching Off");
}while(input != 14);
}
}
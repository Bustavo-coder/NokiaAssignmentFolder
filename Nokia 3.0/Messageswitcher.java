import java.util.Scanner;
public class Messageswitcher{

		
	

	public static void messageMenu(){

	Scanner inputCollector = new Scanner(System.in);
	
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
		int inputMessageSetting;
		do{
		System.out.println("Enter for Message Settings");
		inputMessageSetting = inputCollector.nextInt();
		if(inputMessageSetting != 0){
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
		case 7:System.out.println("7--> Write Messages");
		 System.out.println(
				"""
				1-> Set 1
				2-> Common
				""");
			Messageswitcher.writeMessagesubMenu();
		break;
		
		default : System.out.println("""
			Invalid Choosing
				""");	
		}
			System.out.println("Enter 00 to Go Back to Messge MainMenu");
			 int messageMainmenu =  inputCollector.nextInt();
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
		0.--> To Exit Message Main Menu
		""");
			
		}
		} while(inputMessageSetting != 0);


}

// Method For case 7 of Main Message Menu

public static void writeMessagesubMenu(){
		Scanner inputCollector = new Scanner(System.in);
			int inputMessageSetting2;
		do{
		System.out.println("Enter options Message Settings");
		inputMessageSetting2 = inputCollector.nextInt();
		if(inputMessageSetting2 != 0){
		switch(inputMessageSetting2){
		case 1 : System.out.println("""
			1->.Message Center Number
			2->.Message Sent as
			3->.Message Validity
				""");
			int  messagingOptions;
			do{
			System.out.println("Enter messaging options");
			messagingOptions =  inputCollector.nextInt();
			if(messagingOptions != 0){
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
			System.out.println("Enter 00 to Go Back to Set Menu");
			messagingOptions =  inputCollector.nextInt();
			System.out.println("""
			1->.Message Center Number
			2->.Message Sent as
			3->.Message Validity
			0.--> to Exit set menu
				""");
			}
			}while(messagingOptions != 0);
			break;
		case 2 : System.out.println("""
			1->.Delivery reports
			2->.Reply via same Center
			3->.Character Support
				""");
				int commonOptions;
			do{
			System.out.println("Enter Common options");
			commonOptions =  inputCollector.nextInt();
			if(commonOptions != 0){
			switch(commonOptions){
			case 1 : System.out.println("""
				1->.Delivery reports
				""");
				break;
			case 2 : System.out.println("""
				2->.Reply via same Center
				""");
				break;
			case 3 : System.out.println("""
				3->.Character Support
				""");
				break;
			default : System.out.println("""
				->.Invalid Input
				""");
				break;	
			}
			System.out.println("Enter 00 to Go Back to Common Menu");
			 int commonsubOptions =  inputCollector.nextInt();
			System.out.println("""
			1->.Delivery reports
			2->.Reply via same Center
			3->.Character Support
			0.--> to exit
				""");
			}
			}while(commonOptions != 0);
			
			break;
		default : System.out.println("""
			Invalid Choosing
				""");	
		}
			System.out.println("Enter 00 to go back to Messgae Settings Menu");
			int messageMenuback = inputCollector.nextInt();
			System.out.println(
				"""
				1-> Set 1
				2-> Common
				""");
		}

		}while(	inputMessageSetting2 != 0);
	


}






}
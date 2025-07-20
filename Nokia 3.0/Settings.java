import java.util.Scanner; 
public class Settings{


	static Scanner inputCollector = new Scanner (System.in);







// MAIN SETINGS METHOD
public static void mainSettings(){
	System.out.println(
		"""
		1->.Settings
		1->.Call Settings
		2->. Phone Settings
		3->. Security Settings
		4->. Restore Factory Settings
		""");
		
		int settingsMainswitch;
do{
		System.out.println("Enter for Settings Menu");
		settingsMainswitch = inputCollector.nextInt();
		if(settingsMainswitch != 0){
		switch(settingsMainswitch){
		case 1 :callSettings();
			break;
		case 2 :phoneSettings();
			break;
		case 3 :securitySettings();
			break;
		case 4 :System.out.println("4--> Restore Factory Settings");
			break;
		default : System.out.println("""
			Invalid Choosing
				""");	
		}
			System.out.println("Enter 00 to Go Back to Settings Menu");
			 int securityMainmenu =  inputCollector.nextInt();
					System.out.println(
					"""
					1->.Settings
					1->.Call Settings
					2->. Phone Settings
					3->. Security Settings
					4->. Restore Factory Settings
					0->.To Exit
					""");
		}
		} while(settingsMainswitch != 0);


}







// CALL SETTINGS METHODS

public static void callSettings(){
	System.out.println(
		"""
		1->.Automatic Redial
		2->. Speed Dialing
		3->. Call Waiting options
		4->. Own number sendings
		5-> Phone Line in use
		6->.Automatic Answer
		""");
		
		int settingsCall;
do{
		System.out.println("Enter for Call Settings");
		settingsCall = inputCollector.nextInt();
		if(settingsCall != 0){
		switch(settingsCall){
		case 1 :System.out.println("1--> Automatic Redial");
			break;
		case 2 :System.out.println("2--> Speed Dialing");
			break;
		case 3 :System.out.println("3-->Call Waiting options");
			break;
		case 4 :System.out.println("4--> Own number sendings");
			break;
		case 5 :System.out.println("5-->  Phone Line in use");
			break;
		case 6 :System.out.println("6--> Automatic Answer");
			break;
		default : System.out.println("""
			Invalid Choosing
				""");	
		}
			System.out.println("Enter 00 to Go Back to Call Settings Menu");
			 int callMainmenu =  inputCollector.nextInt();
				System.out.println(
					"""
					1->.Automatic Redial
					2->. Speed Dialing
					3->. Call Waiting options
					4->. Own number sendings
					5-> Phone Line in use
					6->.Automatic Answer
					0->.To Exit
					""");
		
		}
		} while(settingsCall != 0);


}






// PHONE SETINGS METHOD
public static void phoneSettings(){
	System.out.println(
		"""
		1->.Language
		2->. Cell info Display
		3->. Welcome Note
		4->. Network Selection
		5-> Lights
		6->.Confirm SIM service actions
		""");
		
		int phoneSetSwitcher;
do{
		System.out.println("Enter for Phone Settings");
		phoneSetSwitcher= inputCollector.nextInt();
		if(phoneSetSwitcher != 0){
		switch(phoneSetSwitcher){
		case 1 :System.out.println("1--> Language");
			break;
		case 2 :System.out.println("2-->  Cell info Display");
			break;
		case 3 :System.out.println("3-->Welcome Note");
			break;
		case 4 :System.out.println("4--> Network Selection");
			break;
		case 5 :System.out.println("5-->   Lights");
			break;
		case 6 :System.out.println("6--> Confirm SIM service actions");
			break;
		default : System.out.println("""
			Invalid Choosing
				""");	
		}
			System.out.println("Enter 00 to Go Back to Phone Settings Menu");
			 int phoneMainmenu =  inputCollector.nextInt();
				System.out.println(
				"""
				1->.Language
				2->. Cell info Display
				3->. Welcome Note
				4->. Network Selection
				5-> Lights
				6->.Confirm SIM service actions
				0->.To Exit
				""");
		
		}
		} while(phoneSetSwitcher != 0);


}




// SECURITY SETINGS METHOD
public static void securitySettings(){
	System.out.println(
		"""
		1->.Pin code requests
		2->. Call barring service
		3->. Fixed Dialling
		4->. Closed user group
		5-> Phone Security
		6->.Change Access Code
		""");
		
		int securitySwitch;
do{
		System.out.println("Enter for Security Settings");
		securitySwitch= inputCollector.nextInt();
		if(securitySwitch != 0){
		switch(securitySwitch){
		case 1 :System.out.println("1--> Language");
			break;
		case 2 :System.out.println("2-->  Cell info Display");
			break;
		case 3 :System.out.println("3-->Welcome Note");
			break;
		case 4 :System.out.println("4--> Network Selection");
			break;
		case 5 :System.out.println("5-->   Lights");
			break;
		case 6 :System.out.println("6--> Confirm SIM service actions");
			break;
		default : System.out.println("""
			Invalid Choosing
				""");	
		}
			System.out.println("Enter 00 to Go Back to Security Settings Menu");
			 int securityMainmenu =  inputCollector.nextInt();
					System.out.println(
					"""
					1->.Pin code requests
					2->. Call barring service
					3->. Fixed Dialling
					4->. Closed user group
					5-> Phone Security
					6->.Change Access Code
					""");
		}
		} while(securitySwitch != 0);


}











	

}
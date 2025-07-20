import java.util.Scanner;
 public class RingingtoneSwitcher {
	static Scanner inputCollector = new Scanner(System.in);

public static void ringingToneMenu(){
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
		
		int ringTones;
do{
		System.out.println("Enter for Message Settings");
		ringTones = inputCollector.nextInt();
		if(ringTones != 0){
		switch(ringTones){
		case 1 :System.out.println("1--> Ringing tone");
			break;
		case 2 :System.out.println("2--> Ringing Volume");
			break;
		case 3 :System.out.println("3--> Incomig call alert");
			break;
		case 4 :System.out.println("4--> Keyad tonnes");
			break;
		case 5 :System.out.println("5--> composer");
			break;
		case 6 :System.out.println("6--> Warning and games tonnes");
			break;
		case 7:System.out.println("7--> vibrating alert");
		break;
		case 8 :System.out.println("8-->Message Alerts tone");
		
		default : System.out.println("""
			Invalid Choosing
				""");	
		}
			System.out.println("Enter 00 to Go Back to Ringing Tone menu");
			 int ringingMainmenu =  inputCollector.nextInt();
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
		} while(ringTones != 0);


}



}
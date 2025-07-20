import java.util.Scanner; 
 public class Clocksswitcher {
	static Scanner inputCollector = new Scanner(System.in);

public static void clockSwitch(){
	System.out.println(
		"""
		1->.Alarm Clocks
		2->. Clock settings
		3->. Date Settings
		4->.Stop Watch
		5->Countdown Timer
		6->.Auto Update of date and time
		""");
		
		int clocks;
do{
		System.out.println("Enter for Message Settings");
		clocks = inputCollector.nextInt();
		if(clocks != 0){
		switch(clocks){
		case 1 :System.out.println("1--> Ringing tone");
			break;
		case 2 :System.out.println("2--> Ringing Volume");
			break;
		case 3 :System.out.println("3--> Incoming call alert");
			break;
		case 4 :System.out.println("4--> Keyad tonnes");
			break;
		case 5 :System.out.println("5--> composer");
			break;
		case 6 :System.out.println("6--> Warning and games tonnes");
			break;
		default : System.out.println("""
			Invalid Choosing
				""");	
		}
			System.out.println("Enter 00 to Go Back to Ringing Clock Menu");
			 int clockMainmenu =  inputCollector.nextInt();
				System.out.println(
					"""
					1->.Alarm Clocks
					2->. Clock settings
					3->. Date Settings
					4->.Stop Watch
					5->Countdown Timer
					6->.Auto Update of date and time
					0.-> 0 to Exit
					""");
		
		}
		} while(clocks != 0);


}



}
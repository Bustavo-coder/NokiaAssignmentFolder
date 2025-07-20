import java.util.Scanner;
public class Callsettingsswitcher{

	static Scanner inputCollector = new Scanner(System.in);

		public static void callRegisterMenu(){
			
		System.out.println(


		"""
	
		1->.Missed call
		2->.Dialled numbers
		3->.Received Calls
		4->.Erase recent calls 
		5->.Show call duration
		6->.Show Call cost
		7->.Call Cost settings
		8-->Prepaid Credits
				""");
		
		
		int callRegister;
		do{
		System.out.println("Choose from  Call Register Options");
		callRegister = inputCollector.nextInt();
		if(callRegister != 0){
		switch(callRegister){
		case 1 : System.out.println("1->.Missed call");
			break;
		
		case 2 : System.out.println("2->. Dialled numbers");
			break;
		case 3 : System.out.println("3->. Received Calls");
			break;
		case 4 : System.out.println("4->. Erase Recent Calls");
			break;
		case 5 : callDuration();
			break;
		case 6 : callCosts();
			break;
		case 7 : System.out.println("7->. Call Costs Settings");
			break;
		case 8 : System.out.println("8->. Prepaid Credits ");
			break;
		}
		System.out.println("Enter 00 to go back to Call Register Menu");
		int registerReturn =  inputCollector.nextInt();
		System.out.println(


		"""
	
		1->.Missed call
		2->.Dialled numbers
		3->.Received Calls
		4->.Erase recent calls 
		5->.Show call duration
		6->.Show Call cost
		7->.Call Cost settings
		8-->Prepaid Credits
		0.--> To Exit
				""");
		};
	}while(callRegister != 0);
		}



		
// call Duration Method		
		public static void callDuration(){
		System.out.println(
			"""
		1->.Last call duration
		2->. All Calls duaration
		3->. Received Calls duration
		4->. Dialled Calls duration
		5->.Clear Timers
			""");
		 int callDuration;
		do{
		System.out.println("Choose from Call Duration Options");
		callDuration = inputCollector.nextInt();
		if(callDuration != 0){ 
		switch(callDuration ){
			case 1 : System.out.println("1->. Last Call Duration");
			break;
		case 5 : System.out.println("2->. All Call Duration");
			break;
		case 6 : System.out.println("3--> Received call Duration");
			break;
		case 7 : System.out.println("4->. Dialled Call Duration");
			break;
		case 8 : System.out.println("8->. Clear Timers ");
			break;	
		default :System.out.println("Invalid Input");


		}
		System.out.println("Return Back to Call Duration Menu");
		int returnBacktoduration = inputCollector.nextInt();
		System.out.println(
			"""
		1->.Last call duration
		2->. All Calls duaration
		3->. Received Calls duration
		4->. Dialled Calls duration
		5->.Clear Timers
		0.--> To Exit
			""");

		}
	}while (callDuration != 0);
		
		

}



// call cost Menu



public static void callCosts(){
		System.out.println(
			"""
		1->.Last call Costs
		2->. All Calls Costs
		3->. All Calls Costs
			""");
		 int callCosts;
		do{
		System.out.println("Choose from Call Cost Options");
		callCosts = inputCollector.nextInt();
		if(callCosts != 0){ 
		switch(callCosts){
			case 1 : System.out.println("1->. Last call Costs");
			break;
			case 2 : System.out.println("2->. All Calls Costs");
			break;
			case 3 : System.out.println("3--> Clear Counters");
			break;	
			default :System.out.println("Invalid Input");


		}
		System.out.println("Return Back to Call Cost Menu");
		int returnBacktocosts = inputCollector.nextInt();
		System.out.println(
			"""
		1->.Last call Costs
		2->. All Calls Costs
		3->. Clear Counters
		0.--> To Exit
					""");

		}
	}while (callCosts != 0);
		
		

} 




// call cost Settings

public static void callCostsSettings(){
		System.out.println(
			"""
		1->. Call Cost Limits
		2->.Show Costs in
			""");
		 int callCostsSettings;
		do{
		System.out.println("Choose from Call Cost Options");
		callCostsSettings = inputCollector.nextInt();
		if(callCostsSettings != 0){ 
		switch(callCostsSettings){
			case 1 : System.out.println("1->.Call Cost Limits  ");
			break;
			case 2 : System.out.println("2->.Show Costs in");
			break;
			default :System.out.println("Invalid Input");
		}
		System.out.println("Return Back to Call Cost Settings Menu");
		int returnBacktocostsSettings = inputCollector.nextInt();
		System.out.println(
			"""
		1->.Last call Costs
		2->. All Calls Costs
		3->. Clear Counters
		0.--> To Exit
					""");

		}
	}while (callCostsSettings != 0);
		
		

}



}
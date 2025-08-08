public class Taskseven{
	public static void main(String [] args){
		for(int count = 1; count < 11;count++){
			int multiples = 1;
			int sum = 0;
				for(int counter = 1; counter < 6; counter++){
			if(count % 4 == 0){
				multiples *= count;
				sum += multiples;
				if(counter == 5){System.out.print(sum);System.out.print(" ");}
					}
				
				}
	


				}



		}



}
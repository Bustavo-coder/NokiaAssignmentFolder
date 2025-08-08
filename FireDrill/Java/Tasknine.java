public class Tasknine{
	public static void main(String [] args){
			int sum = 0;
		for(int count = 1; count < 11;count++){
			int multiples = 1;
				for(int counter = 1; counter < 6; counter++){
			if(count % 4 == 0){
				multiples *= count;
				sum += multiples;
					}
				
				}
				}

			System.out.print((int) Math.pow(sum,2));

		}



}
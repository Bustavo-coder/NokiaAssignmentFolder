import java.util.Scanner;

public class Newrandom{
	public static void main (String [] args){
	Scanner input = new Scanner (System.in);
	
	int systemGuess = (int) Math.random(8);
	int systemGuess2 = (int) Math.random() * 3 ;
	int systemGuess3 = (int) Math.random() * 4;
	
	System.out.printf("%d%d%d", systemGuess,systemGuess2,systemGuess3);

}
}	

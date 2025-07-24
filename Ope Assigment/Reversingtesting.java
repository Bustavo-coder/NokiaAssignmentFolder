public class Reversingtesting{

	public static void main (String [] args){

	String word = "shade";
	char ch  = 'd';

	int positionOfCh =  Reversestring.loopString(word,ch);
	System.out.println( positionOfCh);
	 String printFrompositionOfChBackward = Reversestring.printReversed(positionOfCh,word);

	System.out.println(printFrompositionOfChBackward);
	String printFromChfoward = Reversestring.printFoward( positionOfCh,word);

	String addingTheBackwardTotheFoward = printFrompositionOfChBackward + printFromChfoward;
	System.out.println(addingTheBackwardTotheFoward);

}
}
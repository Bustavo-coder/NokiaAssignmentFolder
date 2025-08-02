import java.util.Arrays;
public class Test{

	public static void main(String [] args){

		int [] numberValues = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arraykata.maximumInt(numberValues));
		System.out.println(Arraykata.minimumInt(numberValues));
		System.out.println(Arraykata.sumOf(numberValues));
		System.out.println(Arraykata.sumOfEvenNumbersIn(numberValues));
		System.out.println(Arraykata.sumOfOddIn(numberValues));
		int []  minmax = Arraykata.minimumAndMaximumOf(numberValues);
		System.out.println(Arrays.toString(minmax));
		System.out.println(Arraykata.numberOfOdds(numberValues));
		System.out.println(Arraykata.numberOfeven(numberValues));
		int [] even = Arraykata.numberOfevenIN(numberValues);
		int [] odds = Arraykata.numberOfodds(numberValues);
		int [] squRES = Arraykata.squaresNumbers(numberValues);
		System.out.println(Arrays.toString(odds));
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(squRES));



	}

}
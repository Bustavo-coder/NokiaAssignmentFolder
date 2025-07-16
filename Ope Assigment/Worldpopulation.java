import java.util.Scanner;
public class Worldpopulation {	
	public static void main (String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Input Current Poulation");
	double population = input.nextDouble();
	
	System.out.println("Input the current growth rate");
	double currentGrowthRate = input.nextDouble();
	
	System.out.println("Input Time Span");
	double timeSpan = input.nextDouble();

	double e =  2.71828; //; eulers constant
	double kt = timeSpan  * currentGrowthRate;
	double populationEstimate = population * Math.pow(kt , e);  // p1 = p0(time * growth rate);
	
	System.out.printf( "%n%s %d%s %f","The Poulation Estimate for", ((int) timeSpan), " years is", populationEstimate);
}
}

//Where p is the relative or current population
 // 8,231,613,070 0.90%
  // k is the growthrate 
 //and t is the time you want to calulate for
 //and e is the eulers consant 2.71828

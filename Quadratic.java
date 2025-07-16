import java.util.Scanner;
public class Quadratic {
 	public static void main (String [] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter leading Co-efficient");
	 double a = input.nextDouble();
	
	System.out.println("Enter Linear Co-efficient");
	 double b = input.nextDouble();
	
	System.out.println("Enter constant");
	 double c = input.nextDouble();
	
	double deteriminat = (b * b) - 4 * a * c ;
	double x = (-b + Math.sqrt(deteriminat)) / (2 * a);
	double x1 = (-b - Math.sqrt(deteriminat)) / (2 * a);
	
	int ans = (int) x;
	int ans1 = (int) x1;

	System.out.println(ans);
	System.out.println(ans1);
if(ans >= 0){

		if(ans == ans1){
		System.out.printf("%d %d %s", ans,ans1,"They Have The Same Root");
}else{
	System.out.printf("%d %d %s", ans,ans1 ,"They Have diffrent Root");
}
}
else {
		System.out.println("It Does Not Have Root ");
};
	
}
}
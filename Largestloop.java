import java.util.Scanner;
public class Largestloop {
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);
		
	int max = 1 ;
	int i = 1;
	int secondmax = -2147483648;
 while(i < 5){
	System.out.printf("%s%d%s%n","Enter Your  ", i ," num");
	int num = input.nextInt();
	if(num > max )
	max = num;

	if( num < max && num > secondmax){
		secondmax = num;
	}else if(num != max && num > secondmax){
		secondmax = num;
}
	
i++;
}
System.out.println(max + " Highest");
System.out.print(secondmax);

}
}
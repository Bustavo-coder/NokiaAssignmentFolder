import java.util.Scanner;
public class Arrayfirst{

public static void main(String [] args){

Scanner input = new Scanner (System.in);
int [] scores = new int[5];


for(int i = 0; i < 5; i++){
	System.out.println("Enter the number " + i);
	scores[i] = input.nextInt();
	}
	
for(int i = 0; i < 5; i++){
	if(i == 1 || i == 3) continue; 
	System.out.println(scores[i]);

}

	

}

}
public class Thirdloop{




		public static void main (String [] args){
int count = 0;		
for(int i = 1 ; i < 7; i++){

for(int s = i; s < 7; s++){
System.out.print("  ");
}
for(int j = i; j > count; j--){
	System.out.print(j + " "); 
}
System.out.println("");
}

}



}
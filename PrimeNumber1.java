 import java.util.Scanner;
public class PrimeNumber1{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number:");
	int number = input.nextInt();
	



for (int check = 2; check<number; check++){
			
  if (number % check == 0){
	System.out.print("It is not a prime number");

  	return;
}


    	
   }	
	System.out.print("It is a prime number");

}




}
import java.util.Random;
import java.util.Scanner;
public class FlipCoin{
public static void main(String[]args){
Random rand = new Random();
Scanner input = new Scanner(System.in);

int upperbound = 2;
int coin = rand.nextInt(upperbound);
//System.out.printf("%d", coin);   
    
 System.out.print("Enter your guess:");
 int guess = input.nextInt();
            
  
    if (guess == coin){
    System.out.print("you are correct!"); 
   }
    if (guess != coin){
     System.out.print("you are incorrect!!");
   }
  


       

              




}



}
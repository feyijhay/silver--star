import java.util.Scanner;
   public class Weight{
 public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.print("Enter user weight in pounds:");
  int pounds = input.nextInt();

 System.out.print("Height in inches:");
  int inches = input.nextInt();

int weightinpounds = pounds * 703;

int inches1 = inches * inches;

int BMI = weightinpounds / inches1;

System.out.printf("%d", BMI);














}




}
  
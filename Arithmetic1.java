import java.util.Scanner;
   public class Arithmetic1 {
   
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Enter first integer: ");
   int number1 = input.nextInt();
 
   System.out.print("Enter second integer: ");
   int number2 = input.nextInt();

   System.out.print("Enter third integer: ");
   int number3 = input.nextInt();
  
   int sum = number1 + number2 + number3;
   System.out.printf("sum is %d%n", sum);

   int average = sum / 3;
   System.out.printf("average is %d%n", average);

   int product = number1 * number2 * number3;
   System.out.printf("product is %d%n", product);

   if (number1 > number2){
   	System.out.printf("%d%n is the largest number", number1);
   }else if (number1 > number3){
   	System.out.printf("%d%n is the largest number", number1);
   }
   if (number2 > number1){
   	System.out.printf("%d%n is the largest number", number2);
   }else if (number2 > number3){
	System.out.printf("%d%n is the largest number", number2);
   }
   if (number3 > number1){
   	System.out.printf("%d%n is the largest number", number3); 
   }else if (number3 > number2){
	System.out.printf("%d%n is the largest number", number3); 
   } 
   if (number1 < number2){
   	System.out.printf("%d%n is the smallest number", number1);
   } else if (number1 < number3){
	System.out.printf("%d%n is the smallest number", number1);
   }
   if (number2 < number1){
   	System.out.printf("%d%n is the smallest number", number2);
   }else if (number2 < number3){
	System.out.printf("%d%n is the smallest number", number2);
   }    
   if (number3 < number2){
   	System.out.printf("%d%n is the smallest number", number3);
   }else if (number3 < number1){
	System.out.printf("%d%n is the smallest number", number3);
   } 
   




   









}





}
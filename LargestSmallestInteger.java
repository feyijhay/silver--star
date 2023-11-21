import java.util.Scanner;
   public class LargestSmallestInteger {
   
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Enter first integer: ");
   int number1 = input.nextInt();
 
   System.out.print("Enter second integer: ");
   int number2 = input.nextInt();

   System.out.print("Enter third integer: ");
   int number3 = input.nextInt();

   System.out.print("Enter fourth integer: ");
   int number4 = input.nextInt();

   System.out.print("Enter fifth integer: ");
   int number5 = input.nextInt();

   int largest = 30;
   int lowest = 10;

    if (number1 > number2 || number1 > number3 || number1 > number4 || number1 > number5 && number2 > number1 || number2 > number3 || number2 > number4 || number2 > number5 && number3 > number1 || number3 > number2 || number3 > number4 || number3 > number5 && number4 > number1 || number4 > number2 || number4 > number3 || number4 > 5 && number5 > number1 || number5 > number2 || number5 > number3 || number5 > number4){
    System.out.printf("%d is the largest", largest);
}

    if ((number1 < number2 || number1 < number3 || number1 < number4 || number1 < number5 && number2 < number1 || number2 < number3 || number2 < number4 || number2 < number5 && number3 < number1 || number3 < number2 || number3 < number4 || number3 < number5 && number4 < number1 || number4 < number2 || number4 < number3 || number4 < 5 && number5 < number1 || number5 < number2 || number5 < number3 || number5 < number4){
    System.out.printf("%d is the lowest", lowest);
}




 }


  
}
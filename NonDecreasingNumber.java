import java.util.Scanner;
    public class NonDecreasingNumber{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

  
    System.out.print("Enter first integer:");
    int number1 = input.nextInt();

    System.out.print("Enter second integer:");
    int number2 = input.nextInt();

    System.out.print("Enter third integer:");
    int number3 = input.nextInt();

    int highest = 0;
    int lowest = 0;
    int middleNumber = 0;
 
    if (number1 > number2){
    // highest = number1; 
   
    if (number1 > number3)
    highest = number1;
}
   if (number2 > number3){
   // highest = number2;
 
    if (number2 > number1)
    highest = number2;
}
    if (number3 > number1){
   // highest = number3;

    if (number3 > number2)
    highest = number3;
}
    if (number1 < number2){
   // lowest = number1;
 
    if (number1 < number3)
    lowest = number1;
}
    if (number2 < number1){
    //lowest = number2;
  
    if (number2 < number3)
     lowest = number2;
}
    if (number3 < number2){
    // lowest = number3;
   
    if (number3 < number2)
     lowest = number3;
}
    if (number1 != highest && number1 != lowest){
    middleNumber = number1;
}
    if (number2 != highest && number2 != lowest){
    middleNumber = number2;
}
    if (number3 != highest && number3 != lowest){
    middleNumber = number3;
}
   System.out.printf("%d, %d, %d",lowest, middleNumber, highest);

    
   













}






}
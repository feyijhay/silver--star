import java.util.Scanner;
     public class ComparingIntegers {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Enter first integer:");
     int integer = input.nextInt();

     int square = integer * integer;
     System.out.printf("square is %d%n", square);

     if (integer > 100){
     System.out.println("The variable is greater than 100");
}    
     if (square > 100){
     System.out.println("The variable is greater than 100");
}
     if (integer == 100){
     System.out.println("The variable is equal to 100");
}
     if (square == 100){
     System.out.println("The variable is equal to 100");
}
     if (integer != 100){
     System.out.println("The variable is not equal to 100");
}
     if (square != 100){
     System.out.println("The variable is not equal to 100");
}
     if (integer < 100){
     System.out.println("The variable is less than 100");
}
     if (square < 100){
     System.out.println("The variable is less than 100");
}





}





}

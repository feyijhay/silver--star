import java.util.Scanner;
    public class Multiples{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

  
    System.out.print("Enter first integer:");
    int number1 = input.nextInt();

    System.out.print("Enter first integer:");
    int number2 = input.nextInt();
  

    int trippled = (number1 + number1 + number1);
       System.out.printf("%d%n", trippled);

    int doubled = (number2 + number2);
      System.out.printf("%d%n", doubled);

    int result = trippled % doubled;
     System.out.printf("%d", result);





}


}
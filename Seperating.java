import java.util.Scanner;
    public class Seperating {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

  
    System.out.print("Enter integer:");
    int integter = input.nextInt();

    int number = 42339;
  
    int number1 = (number / 10000);
    System.out.printf("%d\t", number1);

    int number2 = (number % 10000) / 1000;
    System.out.printf("%d\t", number2);
    
    int number3 = (number % 1000) / 100;
    System.out.printf("%d\t", number3);

    int number4 = (number % 100) / 10;
    System.out.printf("%d\t", number4);     

    int number5 = (number % 10 );
    System.out.printf("%d", number5);
    
    




}



}
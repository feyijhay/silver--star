import java.util.Random;
import java.util.Scanner;
public class Lottery{
public static void main(String[]args){
Random rand = new Random();
Scanner input = new Scanner(System.in);

     int number = 1000;
     int lottery = rand.nextInt(number);
    int main = 675;

       int computer1 = main / 100;
       System.out.printf("%d%n", computer1);

       int computer2 = (main % 100) / 10;
       System.out.printf("%d%n", computer2);
   

       int computer3  = (main % 10);
       System.out.printf("%d%n", computer3);

       System.out.print("Enter your a three digit number:");
       int customerNumber = input.nextInt();
   
        
        int customer1 = customerNumber / 100;
        System.out.printf("%d%n", customer1);
 
        int customer2 = (customerNumber % 100) / 10;
         System.out.printf("%d%n", customer2);

         int customer3 = customerNumber % 10;
          System.out.printf("%d%n", customer3);

        if (customerNumber == main){
       System.out.printf("Award is $10,000 %n");
     }
      if (customer1 == computer2 || customer2 == computer3 || customer1 == computer3 && customer2 == computer1 || customer2 == computer3 || customer2 == computer3 && customer3 == computer1 || customer3 == computer2 || customer3 == computer3){
      System.out.printf("Award is $3,000 %n");
}
     if (customer1 == computer2 || customer1 == computer1 || customer1 == computer3){
     System.out.printf("Award is $1,000");
}


 }


}   
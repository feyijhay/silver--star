import java.util.Scanner;
   public class Currency{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("enter exchange rate:");
   double exchangeRate = input.nextDouble();

   System.out.print("enter 0 to convert dollars to rmb and 1 to convert rmb and dollars:");
    int Conversion = input.nextInt();


    if (Conversion == 0){
    System.out.print("Enter amount to convert in dollars:");
    double dollarAmount = input.nextDouble();

    double convertedDollar = dollarAmount * exchangeRate;
    System.out.printf("$%.1f is %.1f yuan", dollarAmount, convertedDollar);   
  }
    if (Conversion == 1){
    System.out.print("Enter amount to convert in rmb:");
    double rmbAmount = input.nextDouble();

    double convertedRmb = rmbAmount / exchangeRate;
    System.out.printf("$%.1f is %.1f yuan", rmbAmount, convertedRmb);   
  }










}

}
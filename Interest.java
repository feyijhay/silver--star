import java.util.Scanner;

public class Interest {

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Balance:");
int balance = input.nextInt();

System.out.print("Enter Interest Rate: ");
int interestRate = input.nextInt();

int annualInterestRate = (interestRate / 1200) * balance;
System.out.printf("The interest is %d%n", annualInterestRate);










}
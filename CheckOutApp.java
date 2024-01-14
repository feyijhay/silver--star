import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CheckOutApp{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.println(" ");
	
	System.out.print("Customer Name:");
	String customerName = input.nextLine();

	double unit = 0;

ArrayList<String> customerItems = new ArrayList<String>();
ArrayList<Integer> numberOfItem = new ArrayList<Integer>();
ArrayList<Double> amountOfGoods = new ArrayList<Double>();
ArrayList<Double> subTotal = new ArrayList<Double>();

	
	System.out.print("Please enter items:");
	String items = input.nextLine();
	customerItems.add(items);

	System.out.print("Please enter items quantity:");
	int quantity = input.nextInt();
	numberOfItem.add(quantity);
	
	System.out.print("Enter amount:");
	double amount = input.nextDouble();
	amountOfGoods.add(amount);

	System.out.print("would you like to add more items?:");
	String moreItems = input.next();
	

	while (moreItems.equals("yes")){
	System.out.print("Please enter items:");
	String newItems = input.next();
	customerItems.add(newItems);

	System.out.print("How many:");
	int pieces = input.nextInt();
	numberOfItem.add(pieces);
 
	System.out.print("How much per unit:");
	unit = input.nextDouble();
	amountOfGoods.add(unit);

	System.out.print("would you like to add more items?:");
	moreItems = input.next();
	
}


System.out.print("Cashier Name:");  
	String cashierName = input.next();
	

System.out.print("How much discount will the customer get:");
	double customerDiscount = input.nextDouble(); 



System.out.println("");

System.out.println("JHAY'S STORE");
	System.out.println("Main Branch");
	System.out.println("LOCATION: 312, Herbert Macaulay Way, Sabo Yaba, Lagos.");
	System.out.println("TEL: 09078480034");
	LocalDateTime date = LocalDateTime.now();
	DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formattedDate = date.format(dateTime);
	System.out.println("Date/Time:" + formattedDate);

System.out.println("Cashier:" + cashierName); 
System.out.println("Customer Name:" + customerName);  

System.out.println("----------------------------------------------------------------------------------------------------------------");
	
System.out.println("ITEM        QTY        PRICE       TOTAL(NGN)");

System.out.println("----------------------------------------------------------------------------------------------------------------");
double total = 0;

for(int check=0; check<customerItems.size();  check++){
	String result = customerItems.get(check);
	int answer = numberOfItem.get(check);
	total = amountOfGoods.get(check);
	double sumOfQuantity = numberOfItem.get(check) * amountOfGoods.get(check);
System.out.println(result  +"        "+ answer + "        " + total + "        " + sumOfQuantity);
subTotal.add(sumOfQuantity);

}	

System.out.println("-----------------------------------------------------------------------------------------------------------------");
double sub = 0;

for(int check=0; check<subTotal.size(); check++){
	 sub = sub + subTotal.get(check); 
}
	
System.out.println("Sub Total:     "+ sub);

double discount = sub * 8 / 100;
System.out.println("Discount:     " + discount);

double VAT = sub * 7.5 / 100;
System.out.println("VAT @ 7.5:     " + VAT);

System.out.println("------------------------------------------------------------------------------------------------------------------");

double billTotal = (sub + VAT) - discount;
System.out.println("Bill Total:     " + billTotal);

System.out.println("------------------------------------------------------------------------------------------------------------------");

System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);

System.out.println("-------------------------------------------------------------------------------------------------------------------");

System.out.print("How much did the customer give you?:");
	int amountPaid = input.nextInt();


System.out.println("");

System.out.println("JHAY'S STORE");
	System.out.println("Main Branch");
	System.out.println("LOCATION: 312, Herbert Macaulay Way, Sabo Yaba, Lagos.");
	System.out.println("TEL: 09078480034");
	LocalDateTime todayDate = LocalDateTime.now();
	DateTimeFormatter todayDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String fformattedDate = date.format(dateTime);
	System.out.println("Date/Time:" + fformattedDate);

System.out.println("Cashier:" + cashierName); 
System.out.println("Customer Name:" + customerName);  

System.out.println("----------------------------------------------------------------------------------------------------------------");

System.out.println("ITEM        QTY        PRICE       TOTAL(NGN)");

System.out.println("----------------------------------------------------------------------------------------------------------------");

double totall = 0;

for(int check=0; check<customerItems.size();  check++){
	String result = customerItems.get(check);
	int answer = numberOfItem.get(check);
	totall = amountOfGoods.get(check);
	double sumOfQuantity = numberOfItem.get(check) * amountOfGoods.get(check);
System.out.println(result  +"        "+ answer + "        " + totall + "        " + sumOfQuantity);

}	
System.out.println("-----------------------------------------------------------------------------------------------------------------");
double subb = 0;


for(int check=0; check<subTotal.size(); check++){
	 subb = subb + subTotal.get(check); 

}
	System.out.println("Sub Total:     "+ subb);

double discounted = subb * 8 / 100;
System.out.println("Discount:     " + discounted);

double VAAT = subb * 7.5 / 100;
System.out.println("VAT @ 7.5:     " + VAT);

System.out.println("------------------------------------------------------------------------------------------------------------------");

double totalAmount = (subb + VAAT) - discounted;
System.out.println("Bill Total:    " + totalAmount);

System.out.println("Amount Paid:    " + amountPaid);

double balance = (amountPaid - totalAmount);
System.out.println("Balance:    " + balance);

System.out.println("-------------------------------------------------------------------------------------------------------------------");

System.out.println("THANK YOU FOR YOUR PATRONAGE!!!");
System.out.println("------------------------------------------------------------------------------------------------------------------");

}




}
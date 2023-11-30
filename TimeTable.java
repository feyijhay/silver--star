import java.util.Scanner;
   public class TimeTable{
public static void main(String[]args){
 Scanner input = new Scanner(System.in);
 System.out.print("Please enter a number from 1-10:");
int number = input.nextInt();


if (number < 0 || number > 10){
 System.out.print("invalid");
}

else{

int count = 1;

while (count < 13){

int table = number * count;

System.out.printf("%d X %d = %d%n", number, count, table);
count = count +1;
}

}

}

}
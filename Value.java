import java.util.Scanner;

public class Value{

  public static void main(String[]args){

  Scanner input = new Scanner(System.in);
  
System.out.print("Enter a number:");
 int number1 = input.nextInt();

System.out.print("Enter a number:");
 int number2 = input.nextInt(); 

int result = 0;
int count = 0;

if (number1 > 0){
  while (count <= number1){
result = result * number1;
count +=1;

 }
}

System.out.printf("%d is raised to the power of %d%n", number1, number2, result);

     


}

} 
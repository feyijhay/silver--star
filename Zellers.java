import java.util.Scanner;
   public class Zellers{
 public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.print("Enter day of the month:");
int q = input.nextInt();

System.out.print("Enter month:");
int m = input.nextInt();

System.out.print("Enter year:");
int y = input.nextInt();

int k = y % 100;

int j = y / 100;

if (m == 1){
 m = 13;
 y--;
}

if (m == 2){
 m = 14;
 y--;
}

int h = (q + 26* (m + 1) / 10 + k + k / 4 + j / 4 + 5 *j) % 7;

if (h == 0 ){
 System.out.print("Saturday");
}

if (h == 1 ){
 System.out.print("Sunday");
}

if (h == 2){
 System.out. print("Monday");
}

if (h == 3){
 System.out.print("Tuesday");
}

if (h == 4 ){
 System.out.print("Wednesday");
}

if (h == 5 ){
 System.out.print("Thursday");
}
if (h == 6){
 System.out.print("Friday");
}


}

}

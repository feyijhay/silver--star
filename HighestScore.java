import java.util.Scanner;
public class HighestScore{
 public static void main(String[]args){
  Scanner input = new Scanner(System.in);

System.out.print("Please enter the number of student:");
int students = input.nextInt();

String name = "" ;
int highest = 0;
int score1 = 1;


while (students >= score1) {
 System.out.print("Enter student name:");
 String studentName = input.next();

 System.out.print("Enter student score:");
 int score = input.nextInt();
 score1 += 1;

 if (score > highest) {
 highest = score;
 name = studentName;}
}

System.out.printf("%s has the highest score %d", name, highest);

 


}

}

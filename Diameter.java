import java.util.Scanner;
public class Diameter{
public static void main(String[]args){
 Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius of a circle:");
     int radius = input.nextInt();



System.out.printf("the diameter is %d%n", 2 * radius);

System.out.printf("the circumference is %f%n", 2 * 3.14159 * radius);

System.out.printf("the area is %f%n", 3.14159 * 100);




}

}



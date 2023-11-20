import java.util.Scanner;
public class Perimeter{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
    System.out.print("Enter first edge of a triangle:");
     int edge1 = input.nextInt();

      System.out.print("Enter second edge of a triangle:");
       int edge2 = input.nextInt();

        System.out.print("Enter third edge of a triangle:");
         int edge3 = input.nextInt();
             
           int perimeter = 0;

           if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge3 + edge1 > edge2){
              perimeter = edge1 + edge2 + edge3;
              System.out.printf("%d, perimeter is valid", perimeter);
          }     

              if (edge1 + edge2 <= edge3 || edge2 + edge1 <= edge3 || edge3 + edge1 <= edge2){
                perimeter = edge1 + edge2 + edge3;
                System.out.printf("%d, perimeter is invalid", perimeter);
          }
             
      

}




}






	
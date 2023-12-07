import java.util.Scanner;

public class State{

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter your state:");
String state = scanner.next();

switch (state) {
	case  "Kebbi", "Sokoto", "Kastina", "Kano","Kaduna", "Zamfara":
		System.out.println("you are from NorthWest Nigeria");
		break;
               
        case  "Borno", "Adamawa", "Yobe", "Taraba", "Gombe", "Jigawa", "Bauchi":
		System.out.println("you are from NorthEast Nigeria");
                break;
        case  "Kogi", "Akwa", "Plateau", "Niger", "Benue", "FCT", "Nasarawa":		                                 
               System.out.println("you are from NorthCentral Nigeria");
               break;
    
        case  "Ogun", "Osun", "Ondo", "Lagos", "Ekiti", "Oyo":
		System.out.println("you are from SouthWest Nigeria");
                break;
        case  "Anambra", "Abia", "Enugu", "Ebonyi", "Imo":
		System.out.println("you are from SouthEast Nigeria");
                break;
        case  "Rivers", "Akwa-ibom", "Bayelsa", "Delta", "Cross-river", "Edo":
		System.out.println("you are from SouthSouth Nigeria");
		break;
                

       }


}




}
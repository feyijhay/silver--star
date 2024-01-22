import java.util.Scanner;

public class StudentScore{

	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print("Please enter student score:");
		int studentScore = input.nextInt();

		if(studentScore >= 80){
			System.out.print("Student has the highest score!");
		}

		else{
			System.out.print("Student failed!");
	
		}
	}

}
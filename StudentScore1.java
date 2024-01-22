import java.util.Scanner;

public class StudentScore1{

	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print("Please enter student score:");
		int studentScore = input.nextInt();
if (studentScore >= 80){
	System.out.print("A");
}
else if (studentScore >= 70){
	System.out.print("B");
}
else if (studentScore >= 60){
	System.out.print("C");
}
else if (studentScore >= 50){
	System.out.print("D");
}

else{
	System.out.print("F");

}

}

}
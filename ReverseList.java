import java.util.Arrays;
public class ReverseList{
	public static void main(String[]args){
	 ReverseList reverse = new ReverseList();
	 int[] numbers = {20,30,40,50,60};
	 int[] answer = reverse.reverseNumbers(numbers);
	System.out.println(Arrays.toString(answer));


	
	}



	public int[] reverseNumbers(int[] number){
	int[] swap = new int[number.length];
	int count = 0;
			
			for(int check = number.length-1; check >= 0; check--){
			swap[count] = number[check];
			count = count + 1;
			
			}
	return swap;
 
			
	}


}
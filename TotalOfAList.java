
public class TotalOfAList{
	public static void main(String[]args){
	TotalOfAList total = new TotalOfAList();
	int[] numbers = {20,30,40,50,60};
	int answer = total.totalNumbers(numbers);
	System.out.printf("the total is:%d", answer);


	}





public int totalNumbers(int[] addition){
int sum = 0;

	for(int check = 0; check <= addition.length-1; check++){
	sum = sum + addition[check];

	//System.out.printf("%d ", sum);

	}

return sum;

  }

}
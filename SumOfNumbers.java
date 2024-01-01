public class SumOfNumbers{
	public static void main(String[]args){
	SumOfNumbers sum = new SumOfNumbers();
	int[] numbers = {5,10,15,20,25};
	int answer = sum.addUp(numbers);
	System.out.printf("The total is:%d%n", answer);

	int result = sum.addUsingWhile(numbers);
	System.out.printf("Total using while is:%d%n", result);

	int reply = sum.addUsingDoWhile(numbers);
	System.out.printf("Total using dowhile is:%d", reply);
	}




public int addUp(int[] number){
int add = 0;

	for(int check=0; check<=number.length-1; check++){
	add = add + number[check];
	}	
return add;
}


public int addUsingWhile(int[] number){
int add = 0;
int check = 0;
	while (check < number.length){
	add = add + number[check];
	check++;
	}
return add;	
}


public int addUsingDoWhile(int[] number){
int add = 0;
int check = 0;
	do {
add = add + number[check];
check++;
} while(check < number.length);

return add;
}





 
}
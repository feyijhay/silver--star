import java.util.Arrays;



public class DescendingOrder{
	public static void main(String[]args){


int[] number = {50,10,100,60,90,70,20,80,40,30};
Arrays.sort(number);
reverse(number);

System.out.print(Arrays.toString(number));
	}

	public static void reverse(int[] number){
int num = number.length;

	for(int check=0; check<num/2; check++){
	
	int numbers = number[check];

number[check] = number[num-check-1];

number[num-check-1]=numbers;

	
	}
	}


}


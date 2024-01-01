public class Elements{
	public static void main(String[]args){
	Elements element = new Elements();
	int[] numbers = {10,20,30,40,50};
	int number = 50;
	element.numberCheck(numbers, number);
	}



public int numberCheck(int[] number, int find){
	for(int check = 0; check <= number.length-1; check++){
		if(number[check] == find){
		System.out.print("The element is in the array!!!");
		}
	}
return find;
}





}
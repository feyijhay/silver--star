public class HighestInArray {
	public static void main(String[]args){
HighestInArray newTest = new HighestInArray();
	int[] numbers = {5,10,50,40,98,66,105};
	int answer = newTest.firstMethod(numbers);
	System.out.printf("The highest of the array is:%d%n", answer);

	int[] number = {200,100,302,404};
	int high = newTest.firstMethod(number);
	System.out.printf("The highest of the array is:%d", high);
  }




	
	public int firstMethod(int[] array){
	 int highest = array[0];
	 for(int check=0; check<=array.length-1; check++){
		if(array[check] > highest){
		highest = array[check];
               }
         }
	
	return highest;
       }



}
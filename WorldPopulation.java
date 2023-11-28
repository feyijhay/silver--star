import java.util.Scanner;
public class WorldPopulation{
    public static void main(String[]args){
   Scanner input = new Scanner(System.in);

System.out.print("Enter current world population:");
   long population = input.nextLong();

System.out.print("Enter annual population growth rate:");
   double populationGrowth = input.nextDouble();

double firstYear = population * (1 + (populationGrowth / 100));

double secondYear = firstYear * (1 + (populationGrowth / 100));

double thirdYear = secondYear * (1 + (populationGrowth / 100));

double fourthYear = thirdYear * (1 + (populationGrowth / 100));

double fifthYear = fourthYear * (1 + (populationGrowth / 100));

System.out.printf("%.1f %.1f %.1f %.1f %.1f", firstYear, secondYear, thirdYear, fourthYear, fifthYear);











}


}
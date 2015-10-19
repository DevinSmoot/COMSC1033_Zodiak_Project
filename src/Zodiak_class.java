/* Project:			Zodiak Project
 * Author:			Devin Smoot
 * Class: 			COMSC 1033
 * Date:			2015-10-19
 * Book location:	Pg. 100
 */
//Import Scanner utility
import java.util.Scanner;
public class Zodiak_class {
	public static void main(String[] args) {
		//Initialize scanner
		Scanner input = new Scanner(System.in);
		//Take user input for year of birth
		System.out.print("Enter the year you were born: ");
		int year = input.nextInt();
		//Display output of birth year
		System.out.print("\nYou were born in the year of the ");
		//Work the problem year % 12 and find the remainder
		//display a case based on the remainder to finish the sentence
		switch (year % 12){
		case 0: System.out.println("monkey."); break;
		case 1: System.out.println("rooster."); break;
		case 2: System.out.println("dog."); break;
		case 3: System.out.println("pig."); break;
		case 4: System.out.println("rat."); break;
		case 5: System.out.println("ox."); break;
		case 6: System.out.println("tiger."); break;
		case 7: System.out.println("rabbit."); break;
		case 8: System.out.println("dragon."); break;
		case 9: System.out.println("snake."); break;
		case 10: System.out.println("horse."); break;
		case 11: System.out.println("sheep."); 
		}
	}
}

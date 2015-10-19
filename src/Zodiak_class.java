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
		//Take user input for month of birth
		System.out.print("Enter the month of the year you were born: ");
		int month = input.nextInt();
		//Take user input for day of birth
		System.out.print("Enter the day of the month you were born: ");
		int day = input.nextInt();
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
		//display Zodiak sign based on month and day
		switch (month){
		case 1:	if (day<20) {System.out.println("Capricorn."); 	break;}
				else 		{System.out.println("Aquarius."); 	break;}
		case 2:	if (day<19)	{System.out.println("Aquarius."); 	break;}
				else		{System.out.println("Pices."); 		break;}
		case 3:	if (day<21)	{System.out.println("Pices."); 		break;}
				else		{System.out.println("Aries."); 		break;}
		case 4:	if (day<20)	{System.out.println("Aries."); 		break;}
				else		{System.out.println("Taurus."); 	break;}
		case 5:	if (day<21)	{System.out.println("Taurus."); 	break;}
				else		{System.out.println("Gemini."); 	break;}
		case 6:	if (day<22)	{System.out.println("Gemini."); 	break;}
				else		{System.out.println("Cancer."); 	break;}
		case 7:	if (day<23)	{System.out.println("Cancer."); 	break;}
				else		{System.out.println("Leo."); 		break;}
		case 8:	if (day<24)	{System.out.println("Leo."); 		break;}
				else		{System.out.println("Virgo."); 		break;}
		case 9:	if (day<23)	{System.out.println("Virgo."); 		break;}
				else		{System.out.println("Libra."); 		break;}
		case 10: if (day<23){System.out.println("Libra."); 		break;}
				else		{System.out.println("Scorpio."); 	break;}
		case 11: if (day<22){System.out.println("Scorpio."); 	break;}
				else		{System.out.println("Sagittarius.");break;}
		case 12: if (day<22){System.out.println("Sagittarius.");	  }
				else		{System.out.println("Capricorn."); 		  }
		}
	}
}

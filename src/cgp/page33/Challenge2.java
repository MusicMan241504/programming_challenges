package cgp.page33;

import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How much pocket money do you get a week? ");
		double weeklyMoney = input.nextDouble();
		System.out.print("How much pocket money do you spend a week? ");
		double spentWeekly = input.nextDouble();
		double weeklySaved = weeklyMoney - spentWeekly;
		double yearlySaved = weeklySaved * 52;
		System.out.println("£" + String.format("%.2f",yearlySaved));
		
		
		input.close();

	}

}

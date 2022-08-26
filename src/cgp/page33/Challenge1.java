package cgp.page33;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the direct distance betweeen A and B in miles? ");
		double directDistMiles = input.nextDouble();
		double directDistKm = directDistMiles * 1.609344;
		double distance = 0.5 * directDistKm * Math.PI;
		System.out.println(Math.round(distance) + "km");
		input.close();

	}

}

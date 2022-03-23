package objective4;
import java.util.Scanner;

public class challenge11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\nHours worked challenge\n");

		//inputs
		System.out.print("Enter hours worked this week: ");
		double hours = input.nextInt();
		System.out.print("Enter hourly rate of pay: ");
		double pay =  input.nextInt();

		//calculator
		if (0 <= hours && hours <=60) {
			if (hours <= 40) {
				double grossPay = hours * pay;
			} else {
				double grossPay = 40 * pay;
				grossPay = grossPay + pay * hours - 40;
			}
			System.out.println("£" + String.format("%.2f",grossPay));
		} else {
			System.out.println("Hours worked must be in the range 0 to 60");
		}
		input.close();
	}

}

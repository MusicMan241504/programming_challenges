package cgp.page20;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Password generator");
		System.out.print("Enter your middle name: ");
		String name = input.nextLine();
		System.out.print("Enter your favourite pasta: ");
		String pasta = input.nextLine();
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("Enter a symbol: ");
		char symbol = input.next().charAt(0);
		System.out.println(name + pasta + number + symbol);
		input.close();
	}

}

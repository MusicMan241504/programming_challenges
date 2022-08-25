package cgp.page20;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			char startChar;
			ArrayList<String> items = new ArrayList<String>();

			for (startChar = 'A'; startChar <= 'Z'; startChar++) {
				System.out.print("Enter an item starting with '" + startChar + "': ");
				String userInput = input.nextLine();
				items.add(userInput);

				System.out.print("I went to the market and bought");
				for (int i = 0; i < items.size(); i++) {
					if (items.size() - i == 1) {// if 1 item left
						System.out.println(" a " + items.get(i));
					} else if (items.size() - i == 2) {// if 2 items left
						System.out.print(" a " + items.get(i) + " and");
					} else {

						System.out.print(" a " + items.get(i) + ",");
					}
				}
			}

			input.close();
		}

	}

}

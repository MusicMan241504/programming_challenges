package cgp.page33;

import java.util.Scanner;

public class Challenge4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 7 letter word: ");
		String word1 = input.nextLine();
		System.out.println(word1.length() == 7);
		System.out.print("Enter a 4 letter word: ");
		String word2 = input.nextLine();
		System.out.println(word2.length() == 4);
		input.close();
	}

}

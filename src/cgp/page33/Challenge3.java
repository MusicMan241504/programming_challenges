package cgp.page33;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Challenge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String animal = "elephant";
		System.out.println(
				animal.charAt(0) + StringUtils.repeat('-', animal.length() - 2) + animal.charAt(animal.length() - 1));
		System.out.print("Guess the animal: ");
		String guess = input.nextLine();
		System.out.println(guess.equals(animal));
		input.close();
	}

}

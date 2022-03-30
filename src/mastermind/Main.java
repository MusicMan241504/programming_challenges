package mastermind;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\nMastermind\n");
		String num = (String)Math.floor(Math.random()*(10000-1000)+1000);
		int guess = 0;
		while (guess != num) {
			guess =  input.nextInt();
			System.out.println(num);

		}

	}
}

package mastermind;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//create Scanner object
		System.out.println("\n\nMastermind\n");
		String num = String.valueOf((int) Math.floor(Math.random()*(10000-1000)+1000));		//generate random number, convert to int then string
		
		//System.out.println(num);		//for debugging
		
		String guess = "";		//create guess string
		while (!guess.equals(num)) {		//repeat until correct guess
			//reset variables
			String num_cp = num;
			int correct_ch = 0;
			int wrong_place_ch = 0;
			
			//get input
			System.out.print("Enter number: ");
			guess = input.nextLine();
			
			String guess_cp = guess;
			
			//process guess
			
			//correct chars
			for (int i = 0; i < 4; i++) {		//repeat for each char in string
				//get i char of string and convert to ascii
				int num_ch = (int)num_cp.charAt(i);
	            int guess_ch = (int)guess_cp.charAt(i);
				if (num_ch == guess_ch) {
					correct_ch++;
					//prevent duplicates
					guess_cp = guess_cp.substring(0, i) + "-" + guess_cp.substring(i + 1);
					num_cp = num_cp.substring(0, i) + "_" + num_cp.substring(i + 1);
				}
			}
			
			//wrong place chars
			for (int g_i = 0; g_i < 4; g_i++) {		//repeat for each char in string
	            char guess_ch = guess_cp.charAt(g_i);
	            int n_i = num_cp.indexOf(guess_ch);
	            if (n_i != -1) {
	            	wrong_place_ch++;
	            	//prevent duplicates
	            	guess_cp = guess_cp.substring(0, g_i) + "-" + guess_cp.substring(g_i + 1);
	            	num_cp = num_cp.substring(0, n_i) + "_" + num_cp.substring(n_i + 1);
	            }
				
			}
			
			
			
			//print results
			System.out.println("Correct digits: " + correct_ch);
			System.out.println("Correct digits in wrong place: " + wrong_place_ch);
			//System.out.println(num_cp);

		}
		System.out.println("Correct");

		
		input.close();
	}
}

package passwd;

import java.util.Scanner;

public class ChangePassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			//create scanner object
		
		System.out.print("Username: ");
		String username = input.nextLine();
		System.out.print("Password: ");
		String password = input.nextLine();
		
		boolean auth = Main.authenticate(username, password);
		
		if (auth) {
			System.out.print("New password: ");
			String newPassword = input.nextLine();
		}
		


		input.close();

	}

}

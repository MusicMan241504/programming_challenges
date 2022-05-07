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
			System.out.print("Confirm password: ");
			String confirmPassword = input.nextLine();
			
			if (newPassword.equals(confirmPassword)) {		//if both passwords same
				Main.changePasswd(username, newPassword);
				System.out.println("Successfully changed password");
			}else {
				System.out.println("Enter the same password");
			}
		}else {
			System.out.println("Your username or password is incorrect");
		}
		


		input.close();

	}

}

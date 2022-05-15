package passwd;

import java.util.Scanner;
import java.io.Console;
import java.util.Arrays;

public class AddUser {

	public static void main(String[] args) {
		Console con = System.console();
		if (con == null) {
			System.out.println("Please run in a console");
			return;
		}
		
		Scanner input = new Scanner(System.in);				//create scanner object
		
		System.out.print("Username: ");
		String username = input.nextLine();
		
		//password input
		System.out.print("Password: ");
		char[] password = con.readPassword();
		String passwdHash = Main.hash(password);		//store password for as little time as possible
		Arrays.fill(password, ' ');
		//confirm password
		System.out.print("Confirm password: ");
		char[] confirmPassword = con.readPassword();
		String confirmPasswdHash = Main.hash(confirmPassword);
		Arrays.fill(confirmPassword, ' ');
		
		
		if (passwdHash.equals(confirmPasswdHash)) {		//if both passwords same
			boolean auth = Main.usernameChk(username);			//checks if username already exists
			
			if (!auth) {	//if username not in file
				Main.newUser(username,passwdHash);	//add user to file
				System.out.println("User successfully added");
			}else {
				System.out.println("User already exists");
			}
			
		}else {
			System.out.println("Enter the same password");
		}
		


		input.close();

	}

}

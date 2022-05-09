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
		System.out.print("Password: ");
		char[] password = con.readPassword();  				//get passwd input as array for security
		String passwd_hash = Main.hash(password);
		Arrays.fill(password, ' ');							//overwerite array to hide password
		
		
		boolean auth = Main.usernameChk(username);			//checks if username already exists
		
		if (!auth) {	//if username not in file
			Main.newUser(username,passwd_hash);	//add user to file
			System.out.println("User successfully added");
		}else {
			System.out.println("User already exists");
		}
		


		input.close();

	}

}

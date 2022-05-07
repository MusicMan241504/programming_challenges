package passwd;

import java.util.Scanner;

public class AddUser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			//create scanner object
		
		System.out.print("Username: ");
		String username = input.nextLine();
		System.out.print("Password: ");
		String password = input.nextLine();
		
		boolean auth = Main.usernameChk(username);			//checks if username already exists
		
		if (!auth) {	//if username not in file
			Main.newUser(username,password);	//add user to file
			System.out.println("User successfully added");
		}else {
			System.out.println("User already exists");
		}
		System.out.println(auth);
		


		input.close();

	}

}

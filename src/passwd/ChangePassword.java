package passwd;

import java.util.Scanner;
import java.io.Console;
import java.util.Arrays;

public class ChangePassword {

	public static void main(String[] args) {
		Console con = System.console();
		if (con == null) {
			System.out.println("Please run in a console");
			return;
		}
		
		
		Scanner input = new Scanner(System.in);			//create scanner object
		
		System.out.print("Username: ");
		String username = input.nextLine();
		System.out.print("Password: ");
		char[] password = con.readPassword();  				//get passwd input as array for security
		String passwd_hash = Main.hash(password);
		Arrays.fill(password, ' ');							//overwerite array to hide password
		
		boolean auth = Main.authenticate(username, passwd_hash);
		
		if (auth) {
			System.out.print("New password: ");
			char[] newPassword = con.readPassword();
			boolean passwdChk = Main.chkPasswd(password);		//check if password passes rules
			if (!passwdChk) {
				Arrays.fill(password, ' ');
				input.close();
				return;
			}
			String newPasswdHash = Main.hash(newPassword);		//store password for as little time as possible
			Arrays.fill(newPassword, ' ');
			
			System.out.print("Confirm password: ");
			char[] confirmPassword = con.readPassword();
			String confirmPasswdHash = Main.hash(confirmPassword);
			Arrays.fill(confirmPassword, ' ');
			
			
			if (newPasswdHash.equals(confirmPasswdHash)) {		//if both passwords same
				Main.changePasswd(username, newPasswdHash);
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

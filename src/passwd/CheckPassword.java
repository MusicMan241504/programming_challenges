package passwd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckPassword {

	public static boolean Main(String username, char[] password) {
		boolean auth = true;

		try {
			File fObj = new File("./src/passwd/rules.txt");
			Scanner fReader = new Scanner(fObj);

			int minlen = 1;
			int upperCase = 0;
			int lowerCase = 0;
			int numbers = 0;
			int special = 0;
			boolean list = false;
			boolean isUserName = false;
			boolean isNew = false;

			// get rules from rules file
			while (fReader.hasNextLine()) {
				String data = fReader.nextLine();

				if (data.indexOf("minlen=") != -1) { // if line contains minlen
					minlen = Integer.valueOf(data.substring(data.indexOf("=") + 1)); // get value after = char
				}
				if (data.indexOf("uppercase=") != -1) { // if line contains uppercase
					upperCase = Integer.valueOf(data.substring(data.indexOf("=") + 1)); // get value after = char
				}
				if (data.indexOf("lowercase=") != -1) { // if line contains lowercase
					lowerCase = Integer.valueOf(data.substring(data.indexOf("=") + 1)); // get value after = char
				}
				if (data.indexOf("numbers=") != -1) { // if line contains numbers
					numbers = Integer.valueOf(data.substring(data.indexOf("=") + 1)); // get value after = char
				}
				if (data.indexOf("specialchar=") != -1) { // if line contains specialchar
					special = Integer.valueOf(data.substring(data.indexOf("=") + 1)); // get value after = char
				}
				if (data.indexOf("list=") != -1) { // if line contains list
					char listCh = data.charAt(data.indexOf("=") + 1); // get val after char
					if (listCh == '1') {
						list = true;
					}
				}
				if (data.indexOf("isusername=") != -1) { // if line contains isusername
					char isUserNameCh = data.charAt(data.indexOf("=") + 1); // get val after char
					if (isUserNameCh == '1') {
						isUserName = true;
					}
				}
				if (data.indexOf("isnew=") != -1) { // if line contains isnew
					char isNewCh = data.charAt(data.indexOf("=") + 1); // get val after char
					if (isNewCh == '1') {
						isNew = true;
					}
				}

			}
			fReader.close();

			// password checks
			auth = uppercaseChk(upperCase, password)&&auth;
			auth = lowercaseChk(lowerCase, password)&&auth;
			auth = numbersChk(numbers, password)&&auth;
			auth = specialChk(special, password)&&auth;
			auth = minlenChk(minlen, password)&&auth;
			auth = listChk(list, password)&&auth;
			auth = usernameChk(isUserName, username, password)&&auth;
			auth = newCheck(isNew, username, password)&&auth;

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}

		return auth;
	}

	private static boolean newCheck(boolean isNew, String username, char[] password) {
		boolean auth = true;
		if (isNew) {
			String passwd_hash = Main.hash(password);
			if (Main.authenticate(username, passwd_hash)) {
				auth = false;
				System.out.print("Password is unchanged\n");
			}
		}
		return auth;

	}

	private static boolean usernameChk(boolean isUserName, String username, char[] password) {
		boolean auth = true;
		if (isUserName) {
			boolean chEqual = true;
			if (password.length == username.length()) { // if equal length
				for (int i = 0; i < username.length(); i++) { // loop through every char in passwd
					if (password[i] != username.charAt(i)) {
						chEqual = false;
					}
				}
			} else {
				chEqual = false;
			}
			if (chEqual) {
				auth = false;
				System.out.print("Password is same as username\n");
			}
		}
		return auth;
	}

	private static boolean listChk(boolean list, char[] password) {
		boolean auth = true;
		if (list) {
			try {
				File listObj = new File("./src/passwd/rockyou.txt");
				Scanner listReader = new Scanner(listObj);
				// loop through common password file
				while (listReader.hasNextLine()) {
					String data = listReader.nextLine();
					boolean chEqual = true;
					if (password.length == data.length()) { // if equal length
						for (int i = 0; i < Math.min(password.length, data.length()); i++) { // loop for min of length
																								// of passwd or file
																								// password
							if (password[i] != data.charAt(i)) {
								chEqual = false;
							}
						}
					} else {
						chEqual = false;
					}
					if (chEqual) {
						auth = false;
						System.out.print("Password is in common password file\n");
					}
				}
				listReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred");
				e.printStackTrace();
			}
		}
		return auth;
	}

	private static boolean minlenChk(int minlen, char[] password) {
		boolean auth = true;
		if (password.length < minlen) { // password length check
			auth = false;
			System.out.println("Password must be at least " + minlen + " chars long");
		}
		return auth;
	}

	private static boolean specialChk(int special, char[] password) {
		boolean auth = true;
		if (special > 0) {
			int specialChars = 0;
			for (int i = 0; i < password.length; i++) {
				if (!Character.isLetterOrDigit(password[i])) {
					specialChars++;
				}
			}
			if (specialChars < special) {
				auth = false;
				System.out.println("Password must contain at least " + special + " special chars");
			}
		}
		return auth;
	}

	private static boolean numbersChk(int numbers, char[] password) {
		boolean auth = true;
		if (numbers > 0) {
			int numChars = 0;
			for (int i = 0; i < password.length; i++) {
				if (Character.isDigit(password[i])) {
					numChars++;
				}
			}
			if (numChars < numbers) {
				auth = false;
				System.out.println("Password must contain at least " + numbers + " numbers");
			}
		}
		return auth;
	}

	private static boolean lowercaseChk(int lowerCase, char[] password) {
		boolean auth = true;
		if (lowerCase > 0) {
			int lowerChars = 0;
			for (int i = 0; i < password.length; i++) {
				if (Character.isLowerCase(password[i])) {
					lowerChars++;
				}
			}
			if (lowerChars < lowerCase) {
				auth = false;
				System.out.println("Password must contain at least " + lowerCase + " lower case chars");
			}
		}
		return auth;
	}

	private static boolean uppercaseChk(int upperCase, char[] password) {
		boolean auth = true;
		if (upperCase > 0) {
			int upperChars = 0;
			for (int i = 0; i < password.length; i++) {
				if (Character.isUpperCase(password[i])) {
					upperChars++;
				}
			}
			if (upperChars < upperCase) {
				auth = false;
				System.out.println("Password must contain at least " + upperCase + " upper case chars");
			}
		}
		return auth;
	}

}

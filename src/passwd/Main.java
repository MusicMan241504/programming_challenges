package passwd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.FileNotFoundException;

public class Main {


	public static boolean chkPasswd(char[] password) {
		boolean auth = true;
		try {
			File fObj = new File("./src/passwd/rules.txt");
			Scanner fReader = new Scanner(fObj);

			int minlen = 6;
			boolean upperCase = false;
			boolean list = false;


			//get rules from rules file
			while (fReader.hasNextLine()) {
				String data = fReader.nextLine();

				if (data.indexOf("minlen=") != -1) {		//if line contains minlen
					minlen = Integer.valueOf(data.substring(data.indexOf("=")+1));			//get value after = char
				}
				if (data.indexOf("uppercase=") != -1) {		//if line contains uppercase
					char upperCaseCh = data.charAt(data.indexOf("=")+1);					//get val after char
					if (upperCaseCh == '1') {
						upperCase = true;
					}
				}
				if (data.indexOf("list=") != -1) {		//if line contains list
					char listCh = data.charAt(data.indexOf("=")+1);					//get val after char
					if (listCh == '1') {
						list = true;
					}
				}

			}
			fReader.close();

			//password checks

			//uppercase
			if (upperCase) {
				boolean upperChar = false;
				for(int i=0;i<password.length;i++){  
					if (Character.isUpperCase(password[i])) {
						upperChar = true;
					}
				}
				if (!upperChar) {
					auth = false;
					System.out.println("Password must contain upper case");
				}
			}

			//minlen
			if (password.length < minlen) {		//password length check
				auth = false;
				System.out.println("Password must be at least " + minlen + " chars long");
			}


			//list
			if (list) {
				File listObj = new File("./src/passwd/rockyou.txt");
				Scanner listReader = new Scanner(listObj);
				//loop through common password file
				while (listReader.hasNextLine()) {
					String data = listReader.nextLine();
					boolean chEqual = true;
					if (password.length == data.length()) {	//if equal length
						for(int i=0;i<Math.min(password.length,data.length());i++){  	//loop for min of length of passwd or file password
							if (password[i] != data.charAt(i)) {
								chEqual = false;
							}
						}
					}else {
						chEqual = false;
					}
					if (chEqual) {
						auth = false;
						System.out.print("Password is in common password file\n");
					}
				}
				listReader.close();
			}


		} catch (FileNotFoundException e ) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		return auth;
	}


	public static void changePasswd(String username, String passwd_hash) {
		List<String> lines = new ArrayList<String>();					//list for storing file contents
		try {
			//read file
			File fObj = new File("./src/passwd/passwd.txt");
			Scanner fReader = new Scanner(fObj);						//open file and create scanner object
			while (fReader.hasNextLine()) {								//read every line
				String data = fReader.nextLine();
				if (data.indexOf(username + ":") != -1) {				//if line contains username
					data = username + ":" + passwd_hash;				//change password
				}
				lines.add(data);
			}
			fReader.close();

			//write file
			FileWriter fWriter = new FileWriter("./src/passwd/passwd.txt");
			for (String line : lines) {
				fWriter.write(line + "\n");
			}
			fWriter.close();


		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}


	public static void newUser(String username, String passwd_hash) {
		try {
			FileWriter fWriter = new FileWriter("./src/passwd/passwd.txt", true);	//open file in append mode
			fWriter.write(username + ":" + passwd_hash + "\n");
			fWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static boolean usernameChk(String username) {	//method to check if username exists
		boolean auth = false;
		try {
			File fObj = new File("./src/passwd/passwd.txt");
			Scanner fReader = new Scanner(fObj);
			while (fReader.hasNextLine()) {
				String data = fReader.nextLine();
				if (data.indexOf(username + ":") != -1) {
					auth = true;
				}
			}

			fReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return auth;
	}


	public static boolean authenticate(String username, String passwd_hash) {	//function to verify username and password
		boolean auth = false;
		try {
			File fObj = new File("./src/passwd/passwd.txt");
			Scanner fReader = new Scanner(fObj);
			while (fReader.hasNextLine()) {
				String data = fReader.nextLine();
				if (data.equals(username + ":" + passwd_hash)) {
					auth = true;
				}
			}

			fReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return auth;

	}


	public static String hash(char[] password) {
		try {
			//convert char array to byte array  

			byte[] passwdBytes = new byte[password.length];			//create byte array to add values to

			for(int i=0;i<password.length;i++){  
				passwdBytes[i] = (byte) password[i]; 
			}

			/*	//for debugging
			for(int i=0;i<passwdBytes.length;i++){  
				System.out.println(passwdBytes[i]);  
				}*/

			// getInstance() method is called with algorithm SHA-512
			MessageDigest md = MessageDigest.getInstance("SHA-512");

			// digest() method is called
			// to calculate message digest of the input string
			// returned as array of byte
			byte[] messageDigest = md.digest(passwdBytes);

			// Convert byte array into signum representation
			BigInteger no = new BigInteger(1, messageDigest);

			// Convert message digest into hex value
			String hashtext = no.toString(16);

			// Add preceding 0s to make it 32 bit
			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}

			// return the HashText
			return hashtext;
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

}

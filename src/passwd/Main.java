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

	public static void changePasswd(String username, String password) {
		String passwd_hash = hash(password);							//hash password
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
	
	
	public static void newUser(String username, String password) {
		String passwd_hash = hash(password);		//hash password
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
	
	
	public static boolean authenticate(String username, String password) {	//function to verify username and password
		boolean auth = false;
		String passwd_hash = hash(password);
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

	
	public static String hash(String passwd_str) {
		try {
			// getInstance() method is called with algorithm SHA-512
			MessageDigest md = MessageDigest.getInstance("SHA-512");

			// digest() method is called
			// to calculate message digest of the input string
			// returned as array of byte
			byte[] messageDigest = md.digest(passwd_str.getBytes());

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

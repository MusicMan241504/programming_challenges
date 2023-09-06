package email_validator;

import java.util.Properties;
import java.util.Scanner;
import java.net.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Main {
	
	private static Properties prop;

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);				//create scanner object
		
		prop = new Properties();					//creat properties object
		prop.load(new FileInputStream("./src/email_validator/api_keys.properties"));

		
		System.out.print("Enter email: ");					//get email
		String email = input.nextLine();
		
		//String valid1 = whoisxmlapi(email);			//run validation func
		String valid2 = quickemail(email);
		
		
		if (valid2.indexOf("\"valid\"") != -1) {		//if contains word valid
			System.out.println("VALID");
		}else {
			System.out.println("INVALID");
		}
		
		System.out.print("Press v for more info: ");	//get more info
		if (input.nextLine().equals("v")) {
			System.out.println(valid2);
			//System.out.println(valid1);
		}
		
		
		input.close();

	}
	
	static String whoisxmlapi(String email) throws IOException{
		String api = prop.getProperty("whoisxml_api");
		String urlStr = "http://emailverification.whoisxmlapi.com/api/v2?apiKey=" + api + "&emailAddress=" + email;
		URL url = new URL(urlStr);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("User-Agent", "Mozilla/5.0");
		
		int code = connection.getResponseCode();
		//System.out.println("GET Response Code: " + code);
		if (code == HttpURLConnection.HTTP_OK) { 	//success
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            }
			in.close();
			
			// print result
            return response.toString();
		}else {
			return "FAIL";
		}

	}
	
	static String quickemail(String email) throws IOException{
		String api = prop.getProperty("quickemail_api");
		String urlStr = "http://api.quickemailverification.com/v1/verify?email=" + email + "&apikey=" + api;
		URL url = new URL(urlStr);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("User-Agent", "Mozilla/5.0");
		
		int code = connection.getResponseCode();
		//System.out.println("GET Response Code: " + code);
		if (code == HttpURLConnection.HTTP_OK) { 	//success
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            }
			in.close();
			
			// print result
            return response.toString();
		}else {
			return "FAIL";
		}

	}

}

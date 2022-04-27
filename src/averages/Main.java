package averages;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			//create scanner object
		List<Double> nums = new ArrayList<Double>();	//create list for storing doubles
		String line = input.nextLine();					//get input and store as string
		
		String[] numStr = null;
		if (line.indexOf(", ") != -1) {					//if contains comma and space
			numStr = line.split(", ");
		}else if (line.indexOf(",") != -1) {			//if contains comma
			numStr = line.split(",");
		}else if (line.indexOf(" ") != -1) {			//if contains space
			numStr = line.split(" ");
		}else {
			System.out.println("Please seperate numbers by a space or comma");
			System.exit(1);
		}
		for (String val : numStr) {
			nums.add(Double.parseDouble(val));			//convert each index in list to a double by adding to num list
		}
		
		double mean_val = mean(nums);
		System.out.println(mean_val);
		input.close();

	}
	
	static double mean(List<Double> nums) {				//method to get mean
		double total = 0;
		for (int i = 0; i < nums.size(); i++) {			//get total
			total = total + nums.get(i);
		}
		double answer = total / nums.size();			//divide by length of array
		return answer;
	}

}

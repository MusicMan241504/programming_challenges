package averages;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			//create scanner object
		ArrayList<Double> nums = new ArrayList<Double>();	//create list for storing doubles
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
		double med_val = median(nums);
		ArrayList<Double> mode_vals = mode(nums);
		System.out.println("Mean: " + mean_val);
		System.out.println("Median: " + med_val);
		//there may be multiple modes
		System.out.print("Mode:");
		for (double mode_val : mode_vals) {
			System.out.print(" " + mode_val);
		}
		input.close();

	}


	static double mean(ArrayList<Double> nums) {				//method to get mean
		double total = 0;
		for (int i = 0; i < nums.size(); i++) {			//get total
			total = total + nums.get(i);
		}
		double answer = total / nums.size();			//divide by length of array
		return answer;
	}


	static double median(ArrayList<Double> nums) {				//method to get median
		double answer = 0;
		Collections.sort(nums);								//sort
		if (nums.size() % 2 == 0) {							//if even
			double num1 = nums.get(nums.size()/2-1);
			double num2 = nums.get(nums.size()/2);
			answer = (num1 + num2) / 2;
		}else {													//odd
			answer = nums.get((int)nums.size()/2);
		}
		return answer;
	}


	static ArrayList<Double> mode(ArrayList<Double> nums) {
		ArrayList<Double> answers = new ArrayList<Double>();
		Map<Double,Integer> map = new HashMap<>();		//create hashmap
		for(double number : nums){						//add data to hash map
			if(map.containsKey(number)){
				map.put(number,map.get(number)+1);
			}else{
				map.put(number,1);
			}
		}

		int max = (Collections.max(map.values()));		//get highest value in hashmap

		for(Map.Entry<Double, Integer> vals : map.entrySet()) {	//get key from val
			if(vals.getValue() == max) {
				answers.add(vals.getKey());
			}
		}
		Collections.sort(answers);	
		return answers;
	}

}

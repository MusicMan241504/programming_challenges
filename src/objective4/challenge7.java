package objective4;

import java.util.ArrayList;
import java.util.Scanner;

public class challenge7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.println("\n\nPortfolio grade challenge\n");
    	
    	int[] gradesNum = {0, 4, 13, 22, 31, 41, 54, 67, 80};
    	String[] gradesLet = {"U", "G", "F", "E", "D", "C", "B", "A", "A*"};
    	    	
    	
    	ArrayList<Integer> marks = new ArrayList<Integer>();
    	
    	System.out.print("Enter mark for analysis: ");
    	marks.add(input.nextInt());
    	System.out.print("Enter mark for design: ");
    	marks.add(input.nextInt());
    	System.out.print("Enter mark for implementation: ");
    	marks.add(input.nextInt());
    	System.out.print("Enter mark for evaluation: ");
    	marks.add(input.nextInt());
    	
    	int mark = 0;
    	for (int i : marks) {
    		mark = mark + i;
    	}
    	System.out.println("Total Mark: " + mark);
    	
    	for (int i = gradesLet.length - 1; i > 0; i--) {
    		if (mark >= gradesNum[i]) {
    			System.out.println("Grade: " + gradesLet[i]);
    			if (i != gradesLet.length - 1) {
    				int markToNext = gradesNum[i+1] - mark;
    				System.out.println("Marks to " + gradesLet[i+1] + " are: " + markToNext);
    			}else {
    				System.out.println("You got the highest grade");
    			}
    			break;
    		}
    	}
    	
    	
    	input.close();
	}

}

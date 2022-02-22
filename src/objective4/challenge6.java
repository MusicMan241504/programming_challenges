package objective4;

import java.util.Scanner;

public class challenge6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.println("\n\nNitrate Challenge\n");
    	System.out.print("Enter the nitrate level: a number between 1 and 50: ");
    	double nitrate = input.nextDouble();
    	double dose = 0;
    	if (nitrate > 10) {
    		dose = 3;
    	}else if (nitrate > 2.5) {
    		dose = 2;
    	}else if (nitrate > 1) {
    		dose = 1;
    	}else {
    		dose = 0.5;
    	}
    	System.out.println("Dose " + dose + "ml");
    	input.close();
	}

}

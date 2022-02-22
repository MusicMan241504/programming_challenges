package objective4;

import java.util.Scanner;

public class challenge2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("\n\nWater temperature challenge\n");

        System.out.print("Enter water temperature: ");
        float temp = input.nextFloat();
        if (temp >= 100) {
            System.out.println("Boiling");
        }else if (temp > 0) {
            System.out.println("Liquid");
        }else {
            System.out.println("Frozen");
        }
        input.close();
	}

}

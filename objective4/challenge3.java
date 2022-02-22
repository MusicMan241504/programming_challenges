package objective4;


import java.util.Scanner;

public class challenge3 {
	
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nVocational grade challenge\n");

        System.out.print("Enter mark: ");
        int mark = input.nextInt();
        if (mark >= 80) {
            System.out.println("DISTINCTION");
        }else if (mark >= 60) {
            System.out.println("MERIT");
        }else if (mark >= 40) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        input.close();
    }
}

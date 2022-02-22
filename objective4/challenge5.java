package objective4;

import java.util.Scanner;

public class challenge5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("\n\nGreatest number challenge\n");
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println(Math.max(num1,num2));
        input.close();
	}

}

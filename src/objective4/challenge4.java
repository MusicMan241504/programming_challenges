package objective4;

import java.util.Scanner;

public class challenge4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("\n\nExtended visual dice challenge\n");

        System.out.print("Enter number 1-6: ");
        int num = input.nextInt();

        String d1 = """
        oooooooooooo
        o          o
        o          o
        o    #     o
        o          o
        o          o
        oooooooooooo
        """;

        String d2 = """
        oooooooooooo
        o          o
        o  #       o
        o          o
        o       #  o
        o          o
        oooooooooooo
        """;

        String d3 = """
        oooooooooooo
        o          o
        o  #       o
        o    #     o
        o       #  o
        o          o
        oooooooooooo
        """;

        String d4 = """
        oooooooooooo
        o          o
        o  #    #  o
        o          o
        o  #    #  o
        o          o
        oooooooooooo
        """;

        String d5 = """
        oooooooooooo
        o          o
        o  #    #  o
        o    #     o
        o  #    #  o
        o          o
        oooooooooooo
        """;

        String d6= """
        oooooooooooo
        o          o
        o  #    #  o
        o  #    #  o
        o  #    #  o
        o          o
        oooooooooooo
        """;


        if (num == 1) {
            System.out.print(d1);
        }else if (num == 2) {
            System.out.print(d2);
        }else if (num == 3) {
            System.out.print(d3);
        }else if (num == 4) {
            System.out.print(d4);
        }else if (num == 5) {
            System.out.print(d5);
        }else if (num == 6) {
            System.out.print(d6);
        }
        input.close();
	}

}

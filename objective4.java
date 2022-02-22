import java.util.Scanner;

class objective4 {


    static void challenge1() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nUnder age challenge\n");

        System.out.print("Enter age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("Over 18");
        } else {
            System.out.println("Under 18");
        }
        input.close();
    }

    
    static void challenge2() {
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


    static void challenge3() {
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


    static void challenge4() {
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



 
    static void challenge5() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nGreatest number challenge\n");
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println(Math.max(num1,num2));
        input.close();
    }


    
    static void challenge6() {
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
    
    
    public static void main(String[] args) {
        //challenge1();
        //challenge2();
        //challenge3();
        //challenge4();
        //challenge5();
    	challenge6();
    }
}
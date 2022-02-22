import java.util.*;

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
       
    
    static void challenge7() {
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
       

    static void challenge8() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("\n\nCash machine challenge\n");
    	
    	int tens = (int) (Math.random()*10);
    	int twenties = (int) (Math.random()*10);
    	int balance = (int) (Math.random()*250);
    	
    	System.out.println("Balance: £" + balance);
    	System.out.println("\nAvailable notes: ");
    	System.out.println(tens + " £10 notes  &  " + twenties + " £20 notes\n");
    	
    	System.out.print("Enter withdrawal amount: ");
    	int withdraw = input.nextInt();
    	if (withdraw <= 250) {		//less than max withdraw
    		if (withdraw <= balance) {			//prevents getting overdrawn
    			if (withdraw % 10 == 0) {		//must be multiple of 10
    				//calculate notes needed
	    			int twentiesNeeded = Math.min((int) withdraw / 20,twenties);
	    			int tensNeeded = (withdraw - twentiesNeeded*20) / 10;
	    			if (tensNeeded <= tens) {
		    			System.out.println("Withdrawal successfull");
		    			System.out.println(twentiesNeeded + " £20 notes");
		    			System.out.println(tensNeeded + " £10 notes");
		    			balance = balance - withdraw;
		    			System.out.println("Balance: £" + balance);
	    			}else {
	    				System.out.println("Not enought notes");
	    			}
	    			
    			}else {
    				System.out.println("You can only withdraw a multiple of 10");
    			}
    		}else {
    			System.out.println("You do not have enough money");
    		}
    	}else {
    		System.out.println("You cannot withdraw more than £250");
    	}
    	input.close();
    }
    
    
    
    public static void main(String[] args) {
        //challenge1();
        //challenge2();
        //challenge3();
        //challenge4();
        //challenge5();
    	//challenge6();
    	//challenge7();
    	challenge8();
    }
}
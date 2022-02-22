package objective4;

import java.util.Scanner;

public class challenge8 {

	public static void main(String[] args) {
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

}

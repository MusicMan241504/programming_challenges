package zombie;

import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);
	public static double defeat_chance = Math.random()*0.5+0.3;
	public static double run_chance = Math.random()*0.5+0.3;
	public static int lives = 10;

	public static void main(String[] args) throws InterruptedException  {
		
		loading(4,1.04);
		print("Welcome to Zombieville\n");
		Thread.sleep(500);
		print("This town contains many zombies\n");
		Thread.sleep(1500);
		print("\nWhat is your username? ");
		String username = input.nextLine();
		print("\n" + username + " prepare to fight for your life\n");
		loading(400,0.95);
		print("RUN!!!!!!!!!!!!!!!!!!!!!!\n");
		while (lives > 0 && defeat_chance < 1 && run_chance < 1 && (defeat_chance > 0 || run_chance > 0)) {
			System.out.print("The chance you defeat a zombie is: " + defeat_chance + "\n");
			System.out.print("The chance you outrun a zombie is: " + run_chance + "\n");
			System.out.print("You have " + lives + " lives\n");
			dec1();
		}
		if (lives == 0) {
			print("You run out of lives");
		}else if(defeat_chance <= 0 && run_chance <= 0) {
			print("The chance you defeat or outrun a zombie is 0");
		}else {
			print("You completed the game");
		}
		input.close();
	}
	
	
	static void print(String text) throws InterruptedException {
		for (char c : text.toCharArray()) {
		    System.out.print(c);
		    Thread.sleep(40);
		}
	}
	
	
	static void loading(int start, double mult) throws InterruptedException {
		System.out.println(new String(new char[100]).replace("\0", "_"));
		
		String text = new String(new char[100]).replace("\0", ".") + "\n";
		double wait = start;
		for (char c : text.toCharArray()) {
			System.out.print(c);
			Thread.sleep((long)wait+1);
			wait = wait * mult;
		}
		
		System.out.println(new String(new char[100]).replace("\0", "_") + "\n");
	}
	
	static void dec1() throws InterruptedException {
		print("There is a zombie what do you want to do? kill it (k) / run (r) ");
		String in = input.next();
		if (in.equals("k")) {
			print("Fighting\n");
			loading(40,1);
			if (Math.random() <= defeat_chance) {
				defeat_chance = defeat_chance + 0.1;
				print("You defeat the zombie\n");
			}else {
				defeat_chance = defeat_chance - 0.1;
				run_chance = run_chance - 0.1;
				lives--;
				print("The zombie injured you\n");
			}
		}else if (in.equals("r")) {
			print("Running\n");
			loading(40,1);
			if (Math.random() <= run_chance) {
				run_chance = run_chance + 0.1;
				print("You outrun the zombie\n");
			}else {
				defeat_chance = defeat_chance - 0.1;
				run_chance = run_chance - 0.1;
				lives--;
				print("The zombie injured you\n");
			}
		}
		if (defeat_chance < 0) {
			defeat_chance = 0;
		}
		if (run_chance < 0) {
			run_chance = 0;
		}
	}
	

}

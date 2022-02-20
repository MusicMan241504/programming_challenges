import java.util.Scanner;  

class objective2 {

    

    static void challenge1() {
        Scanner input = new Scanner(System.in);   // create scanner object
        System.out.println("\n\nSimple adder challenge\n");

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }


    static void challenge2() {
        Scanner input = new Scanner(System.in);   // create scanner object
        System.out.println("\n\nTest marks challenge\n");

        System.out.print("Enter first score: ");
        int mark1 = input.nextInt();
        System.out.print("Enter second score: ");
        int mark2 = input.nextInt();
        System.out.print("Enter third score: ");
        int mark3 = input.nextInt();

        float mean = (float) (mark1 + mark2 + mark3) / 3;   // must convert to float to recieve answer as float
        System.out.println("Your average score is " + mean);

    }


    static void challenge3() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nTemperature converter challenge\n");

        System.out.print("Enter temperature in Fahrenheit: ");
        float fTemp = input.nextFloat();
        System.out.println(fTemp);
        float cTemp = (fTemp - 32) * ((float) 5/9);

        System.out.println(fTemp + "\u00B0F = " + cTemp + "\u00B0C");
    }


    public static void main(String[] args) {

        //challenge1();
        //challenge2();
        challenge3();


    }
}
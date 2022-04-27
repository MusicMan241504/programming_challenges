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
        input.close();
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
        input.close();

    }


    static void challenge3() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nTemperature converter challenge\n");

        System.out.print("Enter temperature in Fahrenheit: ");
        float fTemp = input.nextFloat();
        System.out.println(fTemp);
        float cTemp = (fTemp - 32) * ((float) 5/9);

        System.out.println(fTemp + "\u00B0F = " + cTemp + "\u00B0C");
        input.close();
    }



    static void challenge4() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nHeight & weight challenge\n");

        System.out.print("Enter height in inches: ");
        float inHeight = input.nextFloat();
        System.out.print("Enter mass in stones: ");
        float stMass = input.nextFloat();
        //must be double to store to many dp
        double cmHeight = inHeight * 2.54;
        double kgMass = stMass * 6.364;

        System.out.println(cmHeight + "cm " + kgMass + "kg");
        input.close();

    }


    static void challenge5() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nToy cars challenge\n");

        System.out.print("Enter time in hours: ");
        float time = input.nextFloat();
        System.out.print("Enter number of toys made: ");
        int toys = input.nextInt();
        double wage = time * 9 + 0.6 * toys;
        System.out.println("Your daily wage is: \u00A3" + wage);
        input.close();
    }


    static void challenge6() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nFish tank volume challenge\n");

        System.out.print("Enter length: ");
        float length = input.nextFloat();
        System.out.print("Enter depth: ");
        float depth = input.nextFloat();
        System.out.print("Enter height: ");
        float height = input.nextFloat();

        double volume = length * height * depth * 0.001;
        System.out.println(volume + " litres");
        input.close();
    }



    static void challenge7() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nCircle properties challenge\n");

        System.out.print("Enter diameter: ");
        float diameter = input.nextFloat();
        float radius = diameter / 2;
        System.out.println("Radius: " + radius);
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("Area: " + area);
        double circ = diameter * Math.PI;
        System.out.println("Circumference: " + circ);
        System.out.print("Enter arc angle in degrees: ");
        float angle = input.nextFloat();
        double arcLength = circ * angle / 360;
        System.out.println("Arc length: " + arcLength);
        input.close();
    }




    public static void main(String[] args) {

        //challenge1();
        //challenge2();
        //challenge3();
        //challenge4();
        //challenge5();
        //challenge6();
        challenge7();

    }
}
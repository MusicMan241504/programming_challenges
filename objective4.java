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
    }


    static void challenge4() {
        Scanner input = new Scanner(System.in);
        
    }




    public static void main(String[] args) {
        //challenge1();
        //challenge2();
        //challenge3();
        challenge4();
    }
}
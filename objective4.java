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

    
    public static void main(String[] args) {
        challenge1();
    }
}
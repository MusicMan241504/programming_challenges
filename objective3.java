import java.util.Scanner;

class objective3 {


    static void challenge1() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nInitials & surname challenge\n");

        System.out.print("Enter forename: ");
        String forename = input.nextLine();
        System.out.print("Enter surname: ");
        String surname = input.nextLine().toUpperCase();
        String initial = Character.toString(forename.charAt(0)).toUpperCase();   //must convert to string so we can have different cases
        System.out.println(initial + " " + surname);

    }


    static void challenge2() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nAirline ticket challenge\n");

        System.out.print("Enter first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter second city: ");
        String city2 = input.nextLine();
        city1 = city1.substring(0, Math.min(city1.length(), 4));
        city2 = city2.substring(0, Math.min(city2.length(), 4));
        System.out.println(city1.toUpperCase() + "-" + city2.toUpperCase());

    }



    public static void main(String[] args) {

        //challenge1();
        challenge2();

    }
}
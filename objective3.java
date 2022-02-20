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



    public static void main(String[] args) {

        challenge1();

    }
}
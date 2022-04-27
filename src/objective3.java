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
        input.close();

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
        input.close();

    }


    static void challenge3() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nName separator challenge\n");

        System.out.println("Enter full name: ");
        String name = input.nextLine();
        String[] names = name.split(" ");
        //make first letter upper case
        String forename = Character.toUpperCase(names[0].charAt(0)) + names[0].substring(1).toLowerCase();
        String surname = Character.toUpperCase(names[1].charAt(0)) + names[1].substring(1).toLowerCase();
        System.out.println("Forename: " + forename);
        System.out.println("Surname: " + surname);
        input.close();
    }


    static void challenge4() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nWord extractor challenge\n");

        String sentence = "Quick brown fox jumps over the lazy dog";
        System.out.println(sentence);
        System.out.print("Enter word to extract: ");
        String extract = input.nextLine();
        int startIndex = sentence.indexOf(extract);
        int endIndex = startIndex + extract.length();
        sentence = sentence.substring(0,startIndex) + sentence.substring(endIndex+1);
        System.out.println(sentence);
        input.close();
    }




    public static void main(String[] args) {

        //challenge1();
        //challenge2();
        //challenge3();
        challenge4();

    }
}
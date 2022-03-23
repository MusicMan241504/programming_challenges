package objective4;
import java.util.Scanner;


public class challenge10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("\n\nTrain Ticket challenge\n");
        
        //inputs
        System.out.print("Enter number of stations: ");
        int stations = input.nextInt();
        System.out.print("Enter number of adults: ");
        int adults = input.nextInt();
        System.out.print("Enter number of children: ");
        int children = input.nextInt();
        System.out.print("Enter number of time: ");
        int time = input.nextInt();
        
        //calculator
        double fare = 20 * stations;
        if (6 <= time && time < 9) {
        	fare = fare + stations * 5;
        }
        fare = fare * adults + fare * children * 0.5;
        
        //result
        System.out.println("£" + String.format("%.2f",fare));
        input.close();
	}

}

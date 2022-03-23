package objective4;

import java.io.FileReader;  
import com.opencsv.CSVReader;  
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class challenge9 {
	public static void main(String args[]) throws Exception {
		Scanner input = new Scanner(System.in);

		CSVReader reader = new CSVReader(new FileReader("./src/objective4/periodictable.csv"));
		List<String[]> list = reader.readAll();
		Iterator<String[]> it = list.iterator();

		String[] header = (String[]) it.next();

		System.out.println("Header list:\n");
		for (String i : header) {
			System.out.println(i);
		}
		System.out.print("\nEnter header: ");

		String header_val = input.nextLine();

		System.out.print("Enter element " + header_val + ": ");
		String symbol = input.nextLine();

		while(it.hasNext()) {
			String[] val = (String[]) it.next();

			if (val[Arrays.asList(header).indexOf(header_val)].equals(symbol)) {
				//System.out.println(Arrays.toString(val));
				for (int i = 0; i < header.length; i++) {
					System.out.println(header[i] + ": " + val[i]);
				}
				System.out.println("\n");
			}
		}
		input.close();
	}
}
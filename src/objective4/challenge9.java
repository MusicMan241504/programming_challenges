package objective4;
import java.io.FileReader;  
import com.opencsv.CSVReader;  

public class challenge9 {
	public static void main(String args[]) {
		try {
			//Instantiating the CSVReader class
		    CSVReader reader = new CSVReader(new FileReader("/programming_challenges/src/objective4/periodictable.csv"));
		    /Reading the contents of the csv file
		      List list = reader.readAll();
		      //Getting the Iterator object
		      Iterator it = list.iterator();
		      while(it.hasNext()) {
		         String[] str = (String[]) it.next();
		         System.out.println(Arrays.toString(str));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
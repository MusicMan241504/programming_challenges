package objective4;
import org.json.simple.JSONObject;

public class challenge9 {
   public static void main(String[] args) {
      JSONObject jsonObject = new JSONObject();
      String text = "Text with special character /\"\'\b\f\t\r\n.";
      System.out.println(text);
      System.out.println("After escaping.");
      text = jsonObject.escape(text);
      System.out.println(text);
   }
}

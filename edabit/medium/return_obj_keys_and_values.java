import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Challenge {
  public static String[] getValues(Map<String, String> dict) {
    String[] values = dict.values().toArray(new String[dict.values().size()]);
    return values;
  }

  public static void main(String[] args) {
    Map<String, String> map1 = new HashMap<String, String>();
    map1.put("a", "1");
    map1.put("b", "2");
    map1.put("c", "3");
    System.out.println(Arrays.toString(getValues(map1)));
  }
}
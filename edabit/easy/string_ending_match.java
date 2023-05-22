import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
  public static boolean checkEnding(String str1, String str2) {
    Pattern pattern = Pattern.compile(str2 + "$");
    Matcher matcher = pattern.matcher(str1);
    boolean matchFound = matcher.find();
    return matchFound;
  }

  public static void main(String[] args) {
    System.out.println(checkEnding("abc", "bc"));
    System.out.println(checkEnding("abc", "d"));
    System.out.println(checkEnding("samurai", "zi"));
    System.out.println(checkEnding("feminine", "nine"));
    System.out.println(checkEnding("convention", "tio"));
  }
}
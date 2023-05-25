import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
  public static int countVowels(String word) {
    int count = 0;

    for (int i = 0; i < word.length(); i++) {
      String character = word.substring(i, i + 1);
      Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
      Matcher matcher = pattern.matcher(character);
      boolean matchFound = matcher.find();

      if (matchFound) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println(countVowels("Celebration"));
    System.out.println(countVowels("Palm"));
    System.out.println(countVowels("Prediction"));
  }
}
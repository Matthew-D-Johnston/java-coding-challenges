public class Challenge {
  public static String getWord(String left, String right) {
    String firstLetter = left.substring(0, 1);
    return firstLetter.toUpperCase() + left.substring(1) + right;
  }

  public static void main(String[] args) {
    System.out.println(getWord("seas", "onal"));
    System.out.println(getWord("comp", "lete"));
    System.out.println(getWord("lang", "uage"));
  }
}
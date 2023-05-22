public class Challenge {
  public static int countWords(String s) {
    String[] words = s.split(" ", 0);
    return words.length;
  }

  public static void main(String[] args) {
    System.out.println(countWords("Just an example here move along"));
    System.out.println(countWords("This is a test"));
    System.out.println(countWords("What an easy task, right"));
  }
}
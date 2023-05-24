public class Challenge {
  public static String reverse(String str) {
    int lastIndex = str.length() - 1;
    String reversedStr = "";

    for (int i = lastIndex; i >= 0; i--) {
      reversedStr = reversedStr + str.charAt(i);
    }

    return reversedStr;
  }

  public static void main(String[] args) {
    System.out.println(reverse("Hello World"));
    System.out.println(reverse("The quick brown fox."));
    System.out.println(reverse("Edabit is really helpful!"));
  }
}
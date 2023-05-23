public class Challenge {
  public static String stutter(String str) {
    String subStr = str.substring(0, 2);
    return subStr + "... " + subStr + "... " + str + "?";
  }

  public static void main(String[] args) {
    System.out.println(stutter("incredible"));
    System.out.println(stutter("enthusiastic"));
    System.out.println(stutter("outstanding"));
  }
}
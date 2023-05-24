public class Challenge {
  public static String intOrString(Object inp) {
    if (inp instanceof String) {
      return "str";
    } else {
      return "int";
    }
  }

  public static void main(String[] args) {
    System.out.println(intOrString(8));
    System.out.println(intOrString("Hello"));
    System.out.println(intOrString(9843532));
  }
}
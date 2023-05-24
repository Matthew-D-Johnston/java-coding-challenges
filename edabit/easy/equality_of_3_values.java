public class Challenge {
  public static int equal(int a, int b, int c) {
    if (a == b && b == c) {
      return 3;
    } else if (a == b || b == c || a == c) {
      return 2;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    System.out.println(equal(3, 4, 3));
    System.out.println(equal(1, 1, 1));
    System.out.println(equal(3, 4, 1));
  }
}
public class Challenge {
  // public static int triangle(int n) {
  //   int sum = 0;

  //   for (int i = 1; i <= n; i++) {
  //     sum += i;
  //   }

  //   return sum;
  // }

  public static int triangle(int n) {
    if (n == 1) {
      return 1;
    }

    return n + triangle(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(triangle(1));
    System.out.println(triangle(6));
    System.out.println(triangle(215));
  }
}
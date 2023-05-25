public class Challenge {
  public static int programmers(int wage1, int wage2, int wage3) {
    int[] wages = {wage1, wage2, wage3};

    int minWage = wage1;
    int maxWage = wage1;

    for (int wage : wages) {
      if (wage < minWage) {
        minWage = wage;
      }

      if (wage > maxWage) {
        maxWage = wage;
      }
    }

    return maxWage - minWage;
  }

  public static void main(String[] args) {
    System.out.println(programmers(147, 33, 526));
    System.out.println(programmers(33, 72, 74));
    System.out.println(programmers(1, 5, 9));
  }
}
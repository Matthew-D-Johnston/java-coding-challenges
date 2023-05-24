public class Challenge {
  public static boolean changeEnough(int[] change, double due) {
    double totalChange = 0;

    totalChange += change[0] * 0.25;
    totalChange += change[1] * 0.10;
    totalChange += change[2] * 0.05;
    totalChange += change[3] * 0.01;

    return totalChange >= due;
  }

  public static void main(String[] args) {
    int[] change1 = {2, 100, 0, 0};
    System.out.println(changeEnough(change1, 14.11));
    int[] change2 = {0, 0, 20, 5};
    System.out.println(changeEnough(change2, 0.75));
  }
}
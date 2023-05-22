public class Challenge {
  public static int addition(int num) {
    num++;
    return num;
  }

  public static void main(String[] args) {
    System.out.println(addition(0));
    System.out.println(addition(9));
    System.out.println(addition(-3));
  }
}
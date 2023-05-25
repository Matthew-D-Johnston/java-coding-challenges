public class Challenge {
  public static int boxSeq(int step) {
    if (step == 0) {
      return 0;
    }

    if (step % 2 == 1) {
      return boxSeq(step - 1) + 3;
    } else {
      return boxSeq(step - 1) - 1;
    }
  }

  public static void main(String[] args) {
    System.out.println(boxSeq(0));
    System.out.println(boxSeq(1));
    System.out.println(boxSeq(2));
    System.out.println(boxSeq(3));
    System.out.println(boxSeq(4));
  }
}
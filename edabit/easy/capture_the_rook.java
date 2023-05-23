public class Challenge {
  public static boolean canCapture(String[] rooks) {
    String rook1 = rooks[0];
    String rook2 = rooks[1];

    char row1 = rook1.charAt(0);
    char col1 = rook1.charAt(1);

    char row2 = rook2.charAt(0);
    char col2 = rook2.charAt(1);

    return row1 == row2 || col1 == col2;
  }

  public static void main(String[] args) {
    String[] rooks1 = {"A8", "E8"};
    System.out.println(canCapture(rooks1));
    String[] rooks2 = {"A1", "B2"};
    System.out.println(canCapture(rooks2));
    String[] rooks3 = {"H4", "H3"};
    System.out.println(canCapture(rooks3));
    String[] rooks4 = {"F5", "C8"};
    System.out.println(canCapture(rooks4));
  }
}
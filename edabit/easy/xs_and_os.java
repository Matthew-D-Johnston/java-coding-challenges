public class Challenge {
  public static boolean getXO(String text) {
    int numXs = 0;
    int numOs = 0;

    for (int i = 0; i < text.length(); i++) {
      char character = text.charAt(i);

      if (character == 'x' || character == 'X') {
        numXs += 1;
      }

      if (character == 'o' || character == 'O') {
        numOs += 1;
      }
    }

    return numXs == numOs;
  }

  public static void main(String[] args) {
    System.out.println(getXO("ooxx"));
    System.out.println(getXO("xooxx"));
    System.out.println(getXO("ooxXm"));
    System.out.println(getXO("zpzpzpp"));
    System.out.println(getXO("zzoo"));
  }
}
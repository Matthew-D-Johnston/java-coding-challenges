public class Challenge {
  public static int letterCounter(char[][] letters, char keyLetter) {
    int counter = 0;

    for (char[] letterRow : letters) {
      for (char letter : letterRow) {
        if (letter == keyLetter) {
          counter += 1;
        }
      }
    }

    return counter;
  }

  public static void main(String[] args) {
    char[][] letters1 = {
                {'D', 'E', 'Y', 'H', 'A', 'D'},
                {'C', 'B', 'Z', 'Y', 'J', 'K'},
                {'D', 'B', 'C', 'A', 'M', 'N'},
                {'F', 'G', 'G', 'R', 'S', 'R'},
                {'V', 'X', 'H', 'A', 'S', 'S'}
    };
    System.out.println(letterCounter(letters1, 'D'));
  }
}
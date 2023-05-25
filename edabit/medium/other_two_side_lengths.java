import java.util.Arrays;

public class Challenge {
  public static double[] otherSides(int shortSide) {
    double longSide = 2.0 * shortSide;
    double midSide = Math.sqrt(3) * shortSide;

    double[] sides = {longSide, midSide};
    return sides;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(otherSides(1)));
    System.out.println(Arrays.toString(otherSides(12)));
    System.out.println(Arrays.toString(otherSides(2)));
    System.out.println(Arrays.toString(otherSides(3)));
  }
}
import java.util.Arrays;

public class Challenge {
  public static int[] arrayOfMultiples(int num, int length) {
    int[] arr = new int[length];

    for (int i = 1; i <= arr.length; i++) {
      arr[i - 1] = i * num;
    }

    return arr;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(arrayOfMultiples(7, 5)));
    System.out.println(Arrays.toString(arrayOfMultiples(12, 10)));
    System.out.println(Arrays.toString(arrayOfMultiples(17, 6)));
  }
}
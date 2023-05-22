public class Challenge {
  public static int countTrue(boolean[] arr) {
    if (arr.length < 1) {
      return 0;
    }

    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i]) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    boolean[] arr = {true, false, false, true, false};
    System.out.println(countTrue(arr));
    boolean[] arr1 = {false, false, false, false};
    System.out.println(countTrue(arr1));
    boolean[] arr2 = {};
    System.out.println(countTrue(arr2));
  }
}
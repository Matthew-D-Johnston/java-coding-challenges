public class Challenge {
  public static boolean existsHigher(int[] arr, int n) {
    for (int num : arr) {
      if (num >= n) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[] arr1 = {5, 3, 15, 22, 4};
    System.out.println(existsHigher(arr1, 10));
    int[] arr2 = {1, 2, 3, 4, 5};
    System.out.println(existsHigher(arr2, 8));
    int[] arr3 = {4, 3, 3, 3, 2, 2, 2};
    System.out.println(existsHigher(arr3, 4));
    int[] arr4 = {};
    System.out.println(existsHigher(arr4, 5));
  }
}
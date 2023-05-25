public class Challenge {
  public static int warOfNumbers(int[] nums) {
    int evenSum = 0;
    int oddSum = 0;

    for (int num : nums) {
      if (num % 2 == 0) {
        evenSum += num;
      } else {
        oddSum += num;
      }
    }

    return Math.abs(evenSum - oddSum);
  }

  public static void main(String[] args) {
    int[] nums1 = {2, 8, 7, 5};
    System.out.println(warOfNumbers(nums1));
    int[] nums2 = {12, 90, 75};
    System.out.println(warOfNumbers(nums2));
    int[] nums3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
    System.out.println(warOfNumbers(nums3));
  }
}
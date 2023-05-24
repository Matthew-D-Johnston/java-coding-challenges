public class Challenge {
  public static int differenceMaxMin(int[] nums) {
    int min = nums[0];
    int max = nums[0];

    for (int num : nums) {
      if (num < min) {
        min = num;
      }

      if (num > max) {
        max = num;
      }
    }

    return max - min;
  }

  public static void main(String[] args) {
    int[] nums1 = {10, 4, 1, 4, -10, -50, 32, 21};
    System.out.println(differenceMaxMin(nums1));
    int[] nums2 = {44, 32, 86, 19};
    System.out.println(differenceMaxMin(nums2));
  }
}
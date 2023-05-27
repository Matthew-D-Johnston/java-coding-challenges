import java.util.Arrays;

public class Challenge {
  // public static int sum(int[] nums) {
  //   if (nums.length == 0) {
  //     return 0;
  //   }

  //   if (nums.length == 1) {
  //     return nums[0];
  //   }

  //   int[] numsLessOne = new int[nums.length - 1];

  //   for (int i = 1; i < nums.length; i++) {
  //     numsLessOne[i - 1] = nums[i];
  //   }

  //   return nums[0] + sum(numsLessOne);
  // }

  public static int sum(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    if (nums.length == 1) {
      return nums[0];
    }

    int[] numsLessOne = Arrays.copyOfRange(nums, 1, nums.length);    

    return nums[0] + sum(numsLessOne);
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 4};
    System.out.println(sum(nums1));
    int[] nums2 = {1, 2};
    System.out.println(sum(nums2));
    int[] nums3 = {1};
    System.out.println(sum(nums3));
    int[] nums4 = {};
    System.out.println(sum(nums4));
  }
}
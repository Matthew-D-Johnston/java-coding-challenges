public class Challenge {
  public static String formatPhoneNumber(int[] nums) {
    String phoneNumber = "";

    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        phoneNumber = phoneNumber + "(";
      }

      if (i == 3) {
        phoneNumber = phoneNumber + ") ";
      }

      if (i == 6) {
        phoneNumber = phoneNumber + "-";
      }

      phoneNumber = phoneNumber + nums[i];
    }

    return phoneNumber;
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    System.out.println(formatPhoneNumber(nums1));
  }
}
public class Challenge {
  public static String fizzBuzz(int num) {
    if (num % 3 == 0 && num % 5 == 0) {
      return "FizzBuzz";
    } else if (num % 3 == 0) {
      return "Fizz";
    } else if (num % 5 == 0) {
      return "Buzz";
    } else {
      return Integer.toString(num);
    }
  }

  public static void main(String[] args) {
    System.out.println(fizzBuzz(3));
    System.out.println(fizzBuzz(5));
    System.out.println(fizzBuzz(15));
    System.out.println(fizzBuzz(4));
  }
}
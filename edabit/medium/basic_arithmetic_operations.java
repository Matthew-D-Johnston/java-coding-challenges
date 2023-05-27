public class Challenge {
  public static int operation(String num1, String num2, String operator) {
    int int1 = Integer.parseInt(num1);
    int int2 = Integer.parseInt(num2);

    switch (operator) {
      case "add":
        return int1 + int2;
      case "subtract":
        return int1 - int2;
      case "multiply":
        return int1 * int2;
      case "divide":
        try {
          return int1 / int2;
        } catch (ArithmeticException e) {
          return Integer.MIN_VALUE;
        }
    }

    return 0;
  }

  public static void main(String[] args) {
    System.out.println(operation("1", "2", "add"));
    System.out.println(operation("4", "5", "subtract"));
    System.out.println(operation("6", "3", "divide"));
    System.out.println(operation("6", "0", "divide"));
  }
}
public class Challenge {
  public static int operate(int num1, int num2, String operator) {
    switch (operator) {
      case "+":
        return num1 + num2;
      case "-":
        return num1 - num2;
      case "*":
        return num1 * num2;
      case "/":
        return num1 / num2;
      case "%":
        return num1 % num2;
    }

    return 0;
  }

  public static void main(String[] args) {
    System.out.println(operate(1, 2, "+"));
    System.out.println(operate(7, 10, "-"));
    System.out.println(operate(20, 10, "%"));
  }
}
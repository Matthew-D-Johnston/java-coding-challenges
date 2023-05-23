public class Challenge {
  public static int calculator(int num1, char operator, int num2) {
    switch (operator) {
      case '+':
        return num1 + num2;
      case '-':
        return num1 - num2;
      case '*':
        return num1 * num2;
      case '/':
        if (num2 == 0) {
          return 0;
        }
        return num1 / num2;
    }

    return 0;
  }

  public static void main(String[] args) {
    System.out.println(calculator(2, '+', 2));
    System.out.println(calculator(2, '-', 2));
    System.out.println(calculator(4, '*', 2));
    System.out.println(calculator(4, '/', 2));
    System.out.println(calculator(4, '/', 0));
  }
}
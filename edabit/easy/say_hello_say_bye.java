public class Challenge {
  public static String sayHelloBye(String name, int num) {
    String capName = name.substring(0, 1).toUpperCase() + name.substring(1);

    if (num == 1) {
      return "Hello " + capName;
    } else {
      return "Bye " + capName;
    }
  }

  public static void main(String[] args) {
    System.out.println(sayHelloBye("alon", 1));
    System.out.println(sayHelloBye("Tomi", 0));
    System.out.println(sayHelloBye("jose", 0));
  }
}
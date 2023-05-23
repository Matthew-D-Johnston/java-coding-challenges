public class Challenge {
  public static double discount(int price, int discount) {
    double decimalDiscount = discount * 0.01;
    double totalDiscount = price * decimalDiscount;
    double discountedPrice = price - totalDiscount;
    return (double) Math.round(discountedPrice * 100) / 100;
  }

  public static void main(String[] args) {
    System.out.println(discount(1500, 50));
    System.out.println(discount(89, 20));
    System.out.println(discount(100, 75));
  }
}
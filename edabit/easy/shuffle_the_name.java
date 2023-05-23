public class Challenge {
  public static String nameShuffle(String name) {
    String[] names = name.split(" ", 0);
    return names[1] + " " + names[0];
  }

  public static void main(String[] args) {
    System.out.println(nameShuffle("Donald Trump"));
    System.out.println(nameShuffle("Rosie O'Donnell"));
    System.out.println(nameShuffle("Seymour Butts"));
  }
}
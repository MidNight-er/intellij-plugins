import java.util.ArrayList
class C {
  public static void main() {
    System.out.println("Hello world");
    if (1 == 1) {
      System.out.println("Another");
    }
    unusedResult();
    unusedResult();
  }

  public static int unusedResult() {
    return 5;
  }
}
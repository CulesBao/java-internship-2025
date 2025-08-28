package src.main.java.basic;

public class Exercise04 {
  public String fibonacci(int n) {
    if (n <= 0) return "Invalid input";

    StringBuilder result = new StringBuilder("1");
    int a = 1, b = 1;

    if (b <= n) {
      result.append(" ").append(b);
    }

    while (true) {
      int next = a + b;
      if (next > n) break;
      result.append(" ").append(next);
      a = b;
      b = next;
    }

    return result.toString();
  }
}

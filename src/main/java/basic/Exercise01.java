package src.main.java.basic;

public class Exercise01 {
  public int gcd(int x, int y) {
    return gcd(y, x % y);
  }

  public int lcm(int x, int y) {
    return (x * y) / gcd(x, y);
  }
}

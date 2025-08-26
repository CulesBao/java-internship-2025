package src.main.java;

public class DemoClass {

  public int sum(int a, int b) {
    return a + b;
  }

  public double max(double x, double y, double z) {
    if (x >= y && x >= z) {
      return x;
    }

    if (y >= z) {
      return y;
    }

    return z;
  }
}

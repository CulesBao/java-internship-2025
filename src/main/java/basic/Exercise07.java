package src.main.java.basic;

public class Exercise07 {
  public int reversedBinary(final int n) {
    String binaryString = Integer.toBinaryString(n);
    String reversedString = new StringBuilder(binaryString).reverse().toString();
    return Integer.parseInt(reversedString, 2);
  }
}

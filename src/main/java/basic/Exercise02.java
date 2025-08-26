package src.main.java.basic;

public class Exercise02 {
  public int sumDigits(int number) {
    return number > 0 ? number % 10 + sumDigits(number / 10) : 0;
  }
}

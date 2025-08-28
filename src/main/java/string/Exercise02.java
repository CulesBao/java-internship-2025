package string;

public class Exercise02 {
  public int sumInString(final String s) {
    int sum = 0, temp = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        temp = temp * 10 + (s.charAt(i) - '0');
      } else {
        sum += temp;
        temp = 0;
      }
    }
    return sum + temp;
  }
}

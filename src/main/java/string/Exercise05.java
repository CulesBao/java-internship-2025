package string;

public class Exercise05 {
  public String expandEncodedString(final String s) {
    if (s == null || s.isEmpty()) return "";

    StringBuilder result = new StringBuilder();
    int i = 0;

    while (i < s.length()) {
      char ch = s.charAt(i);
      i++;

      int num = 0;
      while (i < s.length() && Character.isDigit(s.charAt(i))) {
        num = num * 10 + s.charAt(i) - '0';
        i++;
      }

      for (int j = 0; j < Math.max(num, 1); j++) {
        result.append(ch);
      }
    }

    return result.toString();
  }
}

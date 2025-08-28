package string;

public class Exercise05 {
  public String expandEncodedString(final String s) {
    if (s == null || s.isEmpty()) return "";

    StringBuilder result = new StringBuilder();
    int i = 0;

    while (i < s.length()) {
      char ch = s.charAt(i);
      i++;

      StringBuilder numBuilder = new StringBuilder();
      while (i < s.length() && Character.isDigit(s.charAt(i))) {
        numBuilder.append(s.charAt(i));
        i++;
      }

      int count = 1;
      if (numBuilder.length() > 0) {
        count = Integer.parseInt(numBuilder.toString());
      }

      for (int j = 0; j < count; j++) {
        result.append(ch);
      }
    }

    return result.toString();
  }
}

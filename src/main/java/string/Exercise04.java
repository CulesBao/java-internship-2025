package string;

public class Exercise04 {
  public String countAppearanceOfCharacter(final String s) {
    if (s == null || s.isEmpty()) return "";

    StringBuilder res = new StringBuilder();
    int count = 1;

    for (int i = 1; i <= s.length(); i++) {
      if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
        count++;
      } else {
        res.append(s.charAt(i - 1));
        if (count > 1) {
          res.append(count);
        }
        count = 1;
      }
    }

    return res.toString();
  }
}

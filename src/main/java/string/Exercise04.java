package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise04 {
  public String countAppearanceOfCharacter(final String s) {
    String res = "";

    Map<String, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < s.length(); i++) {
      String key = String.valueOf(s.charAt(i));
      if (map.containsKey(key)) {
        map.put(key, map.get(key) + 1);
      } else {
        map.put(key, 1);
      }
    }

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        res += entry.getKey() + entry.getValue();
      } else {
        res += entry.getKey();
      }
    }

    return res;
  }
}

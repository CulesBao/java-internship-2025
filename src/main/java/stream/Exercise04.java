package stream;

import java.util.List;

public class Exercise04 {
  public List<Integer> sortByAlphabet(final List<Integer> l) {
    return l.stream().map(x -> String.valueOf(x)).toList().stream()
        .sorted()
        .map(x -> Integer.valueOf(x))
        .toList();
  }
}

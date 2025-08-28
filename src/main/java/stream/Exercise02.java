package stream;

import java.util.List;

public class Exercise02 {
  public int findMissingElementInList(final List<Integer> l, final int n) {
    return (n * (n + 1)) / 2 - l.stream().mapToInt(x -> x).sum();
  }
}

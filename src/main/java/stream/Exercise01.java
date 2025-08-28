package stream;

import java.util.List;

public class Exercise01 {
  public int findSumOfList(final List<Integer> l) {
    return l.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum()
        - l.stream().filter(x -> x % 2 != 0).mapToInt(Integer::intValue).sum();
  }
}

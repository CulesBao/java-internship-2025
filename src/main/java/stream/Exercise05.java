package stream;

import java.util.List;

public class Exercise05 {
  public int sumOfLonggestNumber(final List<Integer> l) {
    int maxLength = l.stream().max(Integer::compareTo).get().toString().length();

    return l.stream()
        .map(x -> x.toString())
        .filter(x -> x.length() == maxLength)
        .mapToInt(Integer::parseInt)
        .sum();
  }
}

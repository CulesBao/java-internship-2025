package stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class Exercise04Test {
  @Test
  public void testSortByAlphabet() {
    final Exercise04 exercise04 = new Exercise04();

    assertEquals(
        List.of(11, 12, 18, 2, 25, 8), exercise04.sortByAlphabet(List.of(12, 2, 8, 11, 25, 18)));
    assertEquals(
        List.of(1, 10, 100, 101, 11, 12),
        exercise04.sortByAlphabet(List.of(12, 1, 10, 11, 100, 101)));
  }
}

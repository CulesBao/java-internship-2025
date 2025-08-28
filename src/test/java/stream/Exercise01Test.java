package stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class Exercise01Test {
  @Test
  public void testFindSumOfList() {
    final Exercise01 exercise = new Exercise01();

    assertEquals(2, exercise.findSumOfList(List.of(1, 2, 3, 4)));
    assertEquals(-9, exercise.findSumOfList(List.of(1, 3, 5)));
    assertEquals(20, exercise.findSumOfList(List.of(2, 4, 6, 8)));
    assertEquals(3, exercise.findSumOfList(List.of(1, 2, 3, 4, 5, 6)));
    assertEquals(0, exercise.findSumOfList(List.of()));
  }
}

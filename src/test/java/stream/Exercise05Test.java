package stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class Exercise05Test {
  @Test
  public void testSumOfLongestNumber() {
    final Exercise05 exercise = new Exercise05();

    assertEquals(999, exercise.sumOfLonggestNumber(List.of(1, 32, 444, 555, 12, 33)));
    assertEquals(5, exercise.sumOfLonggestNumber(List.of(5)));
    assertEquals(15, exercise.sumOfLonggestNumber(List.of(1, 2, 3, 4, 5)));
    assertEquals(100, exercise.sumOfLonggestNumber(List.of(10, 20, 30, 40)));
    assertEquals(300, exercise.sumOfLonggestNumber(List.of(100, 200, 30, 40)));
  }
}

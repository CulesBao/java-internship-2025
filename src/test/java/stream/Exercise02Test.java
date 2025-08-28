package stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class Exercise02Test {
  @Test
  public void testFindMissingElementInList() {
    Exercise02 exercise = new Exercise02();

    assertEquals(3, exercise.findMissingElementInList(List.of(1, 2, 4, 5), 5));
    assertEquals(1, exercise.findMissingElementInList(List.of(2, 3, 4, 5), 5));
    assertEquals(5, exercise.findMissingElementInList(List.of(1, 2, 3, 4), 5));
    assertEquals(0, exercise.findMissingElementInList(List.of(), 0));
    assertEquals(1, exercise.findMissingElementInList(List.of(), 1));
  }
}

package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise02Test {
  @Test
  public void testBinarySearch() {
    final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    final Exercise02 exercise = new Exercise02();

    assertEquals(0, exercise.binarySearch(array, 1));
    assertEquals(4, exercise.binarySearch(array, 5));
    assertEquals(9, exercise.binarySearch(array, 10));
    assertEquals(-1, exercise.binarySearch(array, 11));
    assertEquals(-1, exercise.binarySearch(array, 0));
  }
}

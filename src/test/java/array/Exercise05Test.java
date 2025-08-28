package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise05Test {
  @Test
  public void testFindMissingNumber() {
    final Exercise05 exercise = new Exercise05();

    assertEquals(4, exercise.findMissingNumber(new int[] {2, 1, 3, 5}, 5));
    assertEquals(1, exercise.findMissingNumber(new int[] {2, 5, 3, 4}, 5));
    assertEquals(5, exercise.findMissingNumber(new int[] {1, 2, 3, 4}, 5));
    assertEquals(3, exercise.findMissingNumber(new int[] {1, 2, 4, 5}, 5));
    assertEquals(6, exercise.findMissingNumber(new int[] {1, 2, 3, 4, 5}, 6));
  }
}

package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise01Test {
  @Test
  public void testFindSumOfArray() {
    final Exercise01 exercise01 = new Exercise01();

    assertEquals(-3, exercise01.findSumOfArray(new int[] {1, 2, 3, 4, 5}));
    assertEquals(-16, exercise01.findSumOfArray(new int[] {7, 3, 5, 1}));
    assertEquals(20, exercise01.findSumOfArray(new int[] {2, 4, 6, 8}));
    assertEquals(0, exercise01.findSumOfArray(new int[] {}));
  }
}

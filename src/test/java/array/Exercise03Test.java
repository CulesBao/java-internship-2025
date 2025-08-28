package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise03Test {
  @Test
  public void testReverseArrayInPlace() {
    final Exercise03 exercise03 = new Exercise03();

    final int[] input1 = {5, 2, 3, 4, 1};
    final int[] expected1 = {1, 4, 3, 2, 5};
    assertArrayEquals(expected1, exercise03.reverseArrayInPlace(input1));

    final int[] input2 = {10, 20, 30, 40};
    final int[] expected2 = {40, 30, 20, 10};
    assertArrayEquals(expected2, exercise03.reverseArrayInPlace(input2));

    final int[] input3 = {7};
    final int[] expected3 = {7};
    assertArrayEquals(expected3, exercise03.reverseArrayInPlace(input3));

    final int[] input4 = {};
    final int[] expected4 = {};
    assertArrayEquals(expected4, exercise03.reverseArrayInPlace(input4));
  }
}

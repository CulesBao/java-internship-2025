package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise04Test {
  @Test
  public void testMergeTwoSortedArrays() {
    final Exercise04 exercise = new Exercise04();

    final int[] a1 = {1, 3, 5};
    final int[] b1 = {2, 4, 6};
    final int[] expected1 = {1, 2, 3, 4, 5, 6};
    assertArrayEquals(expected1, exercise.mergeTwoSortedArrays(a1, b1));

    final int[] a2 = {1, 2, 3};
    final int[] b2 = {4, 5, 6};
    final int[] expected2 = {1, 2, 3, 4, 5, 6};
    assertArrayEquals(expected2, exercise.mergeTwoSortedArrays(a2, b2));

    final int[] a3 = {};
    final int[] b3 = {1, 2, 3};
    final int[] expected3 = {1, 2, 3};
    assertArrayEquals(expected3, exercise.mergeTwoSortedArrays(a3, b3));

    final int[] a4 = {1, 2, 3};
    final int[] b4 = {};
    final int[] expected4 = {1, 2, 3};
    assertArrayEquals(expected4, exercise.mergeTwoSortedArrays(a4, b4));

    final int[] a5 = {};
    final int[] b5 = {};
    final int[] expected5 = {};
    assertArrayEquals(expected5, exercise.mergeTwoSortedArrays(a5, b5));

    final int[] a6 = {1, 1, 1};
    final int[] b6 = {1, 1, 1};
    final int[] expected6 = {1, 1, 1, 1, 1, 1};
    assertArrayEquals(expected6, exercise.mergeTwoSortedArrays(a6, b6));
  }
}

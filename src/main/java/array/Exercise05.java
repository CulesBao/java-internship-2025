package array;

public class Exercise05 {
  public int findMissingNumber(final int[] a, final int n) {
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;
    for (int num : a) {
      actualSum += num;
    }
    return expectedSum - actualSum;
  }
}

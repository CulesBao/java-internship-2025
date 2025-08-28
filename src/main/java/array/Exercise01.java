package array;

public class Exercise01 {
  public int findSumOfArray(final int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += (a[i] % 2 == 0) ? a[i] : -a[i];
    }
    return sum;
  }
}

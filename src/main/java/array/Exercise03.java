package array;

public class Exercise03 {
  public int[] reverseArrayInPlace(final int[] a) {
    int l = 0;
    int r = a.length - 1;

    while (l < r) {
      a[l] = a[l] + a[r];
      a[r] = a[l] - a[r];
      a[l] = a[l] - a[r];
      l++;
      r--;
    }

    return a;
  }
}

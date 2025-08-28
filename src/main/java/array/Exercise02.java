package array;

public class Exercise02 {
  public int binarySearch(final int[] a, final int k) {
    int l = 0;
    int r = a.length - 1;

    while (l <= r) {
      int mid = l + (r - l) / 2;

      if (a[mid] == k) {
        return mid;
      } else if (a[mid] < k) {
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }

    return -1;
  }
}

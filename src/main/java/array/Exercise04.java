package array;

public class Exercise04 {
  public int[] mergeTwoSortedArrays(final int[] a, final int[] b) {
    int[] mergedArray = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length) {
      if (a[i] <= b[j]) {
        mergedArray[k++] = a[i++];
      } else {
        mergedArray[k++] = b[j++];
      }
    }

    while (i < a.length) {
      mergedArray[k++] = a[i++];
    }

    while (j < b.length) {
      mergedArray[k++] = b[j++];
    }

    return mergedArray;
  }
}

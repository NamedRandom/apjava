import java.util.*;

class Merge {
  public static void main(String[] args) {

    Random rng = new Random();

    for (int i = 0; i < 1; i++) {

      int[] a = new int[rng.nextInt(30) + 20], b = new int[rng.nextInt(30) + 20];
      for (int j = 0; j < a.length; j++) a[j] = rng.nextInt();
      for (int j = 0; j < b.length; j++) b[j] = rng.nextInt();

      Arrays.sort(a);
      Arrays.sort(b);
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));

      System.out.println(Arrays.toString(merge(a, b)));
    }
  }

  public static int[] merge(int[] A, int[] B) {
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    int i = 0, j = 0;
    if (A[A.length - 1] < B[0]) {
      int[] out = new int[A.length + B.length];
      for (int n = 0; n < out.length; n++) out[n] = n >= A.length ? A[n] : B[n - A.length];
      return out;
    }
    if (B[B.length - 1] < A[0]) {
      int[] out = new int[A.length + B.length];
      for (int n = 0; n < out.length; n++) out[n] = n >= B.length ? B[n] : A[n - B.length];
      return out;
    }
    while (i < A.length && j < B.length) {
      boolean greater = A[i] >= B[j];
      int intToAdd = greater ? A[i] : B[j];
      if (!tmp.contains(intToAdd)) tmp.add(intToAdd);
      if (greater) i++;
      else j++;
    }
    if (i == A.length - 1 && j < B.length - 1) for (int n : B) if (!tmp.contains(n)) tmp.add(i);
    if (j == B.length - 1 && i < A.length - 1) for (int n : A) if (!tmp.contains(n)) tmp.add(i);

    // convert to primitve array
    int[] out = new int[tmp.size()];
    for (i = 0; i < out.length; i++) out[i] = tmp.get(i);
    return out;
  }
}

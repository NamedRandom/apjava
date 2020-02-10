import java.util.Random;

class OrderMattersTest {
  public static void main(String[] args) {

    Random rng = new Random();

    int arr1row = rng.nextInt(5) + 5;
    int arr1col = rng.nextInt(5) + 5;
    double[] arr1 = new double[arr1row * arr1col];
    int arr2row = rng.nextInt(5) + 5;
    int arr2col = rng.nextInt(5) + 5;
    double[] arr2 = new double[arr2row * arr2col];
    int arr3row = rng.nextInt(5) + 5;
    int arr3col = rng.nextInt(5) + 5;
    double[] arr3 = new double[arr3row * arr3col];
    for (int i = 0; i < arr1.length; i++) arr1[i] = (rng.nextDouble() + 1) * arr1.length;
    for (int i = 0; i < arr2.length; i++) arr2[i] = (rng.nextDouble() + 2) * arr2.length;
    for (int i = 0; i < arr3.length; i++) arr3[i] = (rng.nextDouble() + 3) * arr3.length;

    OrderMatters a1 = new OrderMatters(arr1row, arr1col);
    OrderMatters a2 = new OrderMatters(arr2row, arr2col);
    OrderMatters a3 = new OrderMatters(arr3row, arr3col);

    a1.rowOrder(arr1);
    a1.print2D();
  }
}

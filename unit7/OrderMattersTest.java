import java.util.Random;

class OrderMattersTest {
  public static void main(String[] args) throws InterruptedException {

    Random rng = new Random();

    for (int i = 0; i < 3; i++) {
      int row = rng.nextInt(5) + 5;
      int col = rng.nextInt(5) + 5;
      double[] arr = new double[row * col];
      for (int j = 0; j < arr.length; j++) arr[j] = j;
      OrderMatters order = new OrderMatters(row, col);
      order.slow = true;
      System.out.println("Row order:");
      order.rowOrder(arr);
      order.print2D();
      order.clear();
      System.out.println("Column order:");
      order.columnOrder(arr);
      order.print2D();
      order.clear();
      System.out.println("Wrapped order:");
      order.wrappedOrder(arr);
      if (!order.slow) order.print2D();
      order.clear();
    }
  }
}

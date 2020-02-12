import java.text.DecimalFormat;
import java.util.Arrays;

class OrderMatters {
  private double[][] orderedData;
  public boolean slow;
  private int rows;
  private int cols;
  private DecimalFormat df = new DecimalFormat("#.##");

  public OrderMatters(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    orderedData = new double[rows][cols];
  }

  public void rowOrder(double[] arr) throws InterruptedException {
    Arrays.sort(arr);
    int rowIndex = 0;
    int colIndex = 0;
    int readIndex = 0;
    while (readIndex < arr.length) {
      if (colIndex == orderedData[0].length) {
        colIndex = 0;
        rowIndex++;
      }
      orderedData[rowIndex][colIndex++] = arr[readIndex++];
      if (slow) slowPrint();
    }
    if (slow) Thread.sleep(2000);
  }

  public void columnOrder(double[] arr) throws InterruptedException {
    Arrays.sort(arr);
    int rowIndex = 0;
    int colIndex = 0;
    int readIndex = 0;
    while (readIndex < arr.length) {
      if (rowIndex == orderedData.length) {
        rowIndex = 0;
        colIndex++;
      }
      orderedData[rowIndex++][colIndex] = arr[readIndex++];
      if (slow) slowPrint();
    }
    if (slow) Thread.sleep(2000);
  }

  public void wrappedOrder(double[] arr) throws InterruptedException {
    Arrays.sort(arr);
    int rowIndex = 0;
    int colIndex = 0;
    int readIndex = 0;
    boolean forward = true;
    while (readIndex < arr.length - 1) {
      orderedData[rowIndex][colIndex] = arr[readIndex];
      if (readIndex != arr.length - 2) {
        if (colIndex == 0 && readIndex > 0) {
          forward = true;
          rowIndex++;
          readIndex++;
          orderedData[rowIndex][colIndex] = arr[readIndex];
        } else if (colIndex == orderedData[0].length - 1) {
          forward = false;
          rowIndex++;
          readIndex++;
          orderedData[rowIndex][colIndex] = arr[readIndex];
        }
      } else if (forward) orderedData[rowIndex][colIndex + 1] = arr[readIndex + 1];
      else orderedData[rowIndex][colIndex - 1] = arr[readIndex + 1];

      if (forward) colIndex++;
      else colIndex--;

      readIndex++;
      if (slow) slowPrint();
    }
    if (slow) Thread.sleep(2000);
  }

  public void print2D() {
    System.out.print("\t");
    for (int i = 0; i < orderedData[0].length; i++) System.out.print("col " + i + "\t");
    System.out.println();
    for (int i = 0; i < orderedData.length; i++) {
      System.out.print("row " + i);
      for (int j = 0; j < orderedData[0].length; j++)
        System.out.print("\t" + df.format(orderedData[i][j]));
      System.out.println();
    }
  }

  private void slowPrint() throws InterruptedException {
    Thread.sleep(250);
    System.out.print("\033\143");
    print2D();
  }

  public void clear() {
    for (int i = 0; i < orderedData.length; i++)
      for (int j = 0; j < orderedData[0].length; j++) orderedData[i][j] = 0;
  }
}

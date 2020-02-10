import java.text.DecimalFormat;
import java.util.Arrays;

class OrderMatters {
  private double[][] orderedData;
  private int rows;
  private int cols;
  private DecimalFormat df = new DecimalFormat("#.##");

  public OrderMatters(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    orderedData = new double[rows][cols];
  }

  public void rowOrder(double[] arr) {
    Arrays.sort(arr);
    int rowIndex = 0;
    int colIndex = 0;
    int readIndex = 0;
    while (rowIndex < orderedData.length && readIndex < arr.length) {
      if (colIndex == orderedData[0].length) {
        colIndex = 0;
        rowIndex++;
      }
      orderedData[rowIndex][colIndex++] = arr[readIndex++];
    }
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
}

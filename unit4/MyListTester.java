import java.util.*;

class MyListTester {
  public static void main(String[] args) {

    String[] arr1 = {
      "ham",
      "anchovies",
      "zzz",
      "extra cheese",
      "zzz",
      "zzz",
      "groundbeef",
      "zzz",
      "mushrooms",
      "onions",
      "pepperoni",
      "zzz",
      "zzz",
      "peppers",
      "sausage"
    };
    arr1 =
        new String[] {
          "ham",
          "anchovies",
          "extra cheese",
          "groundbeef",
          "mushrooms",
          "onions",
          "pepperoni",
          "peppers",
          "peasd",
          "pe",
          "pepp",
          "p",
          "pep",
          "pepper",
          "sausage"
        };
    arr1 = new String[1500];
    for (int i = 0; i < arr1.length; i++) arr1[i] = rngString();
    Pizza p1 = new Pizza(arr1);
    p1.printTopping();
    int binaryWin = 0;
    int iterWin = 0;
    int iterAvg = 0;
    int binaryAvg = 0;
    for (int i = 0; i < 1000; i++) {
      String string = p1.toppings[(new Random()).nextInt(p1.toppings.length)];
      long start = System.nanoTime();
      p1.binarySearch(string);
      long stop = System.nanoTime();
      long start1 = System.nanoTime();
      p1.iterhelp(string);
      long stop1 = System.nanoTime();
      iterAvg += stop1 - start1;
      binaryAvg += stop - start;
      if (stop1 - start1 > stop - start) binaryWin++;
      else {
        iterWin++;
        System.out.println(p1.iterhelp(string));
        System.out.println(string);
      }
    }
    System.out.println("Binary win:" + binaryWin + " iter win:" + iterWin);
    System.out.println("Binary avg:" + binaryAvg / 1000.0 + " iter avg:" + iterAvg / 1000.0);
  }

  public static String rngString() {

    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
      int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
      buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();
    return generatedString;
  }
}

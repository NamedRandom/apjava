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
    Pizza p1 = new Pizza(arr1);
    p1.printTopping();
  }
}

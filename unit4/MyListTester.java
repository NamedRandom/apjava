import java.util.*;

class MyListTester {
  public static void main(String[] args) {

    String[] arr1 = {
      "ham",
      "anchovies",
      "zzz",
      "extra cheese",
      "zzz",
      null,
      "groundbeef",
      "zzz",
      "mushrooms",
      "onions",
      null,
      "pepperoni",
      "zzz",
      "zzz",
      "peppers",
      "sausage"
    };
    Pizza p1 = new Pizza(arr1);
    p1.printTopping();
    System.out.printf("num toppings: %d\n", p1.getNumTopping());
    System.out.println(p1.addTopping("olives"));
    System.out.println(p1.addTopping("ham"));
    System.out.println(p1.addTopping("zzz"));
    System.out.println(p1.addTopping(null));
    System.out.println(p1.addTopping("ham"));
    System.out.println(p1.addTopping("ham"));
    System.out.println(p1.addTopping("ham"));
    System.out.println(p1.addTopping("ham"));
    System.out.println(p1.addTopping("ham"));
    System.out.println(p1.addTopping("zzz"));
    System.out.println(p1.addTopping(null));
    System.out.println(p1.addTopping("zzz"));
    System.out.println(p1.addTopping(null));
    System.out.println(p1.addTopping("zzz"));
    System.out.println(p1.addTopping(null));
    p1.printTopping();
    System.out.printf("num toppings: %d\n", p1.getNumTopping());
    System.out.println(p1.binarySearch(null));
    System.out.println(p1.binarySearch("ham"));
    System.out.println(p1.binarySearch("zzz"));
  }
}

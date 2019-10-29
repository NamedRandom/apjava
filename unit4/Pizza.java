import java.util.*;

class Pizza {

  private final int MAX = 15;
  private String[] toppings;
  private int numToppings;

  public Pizza(String[] t) {
    if (t.length > MAX) return;
    toppings = t;
    Arrays.sort(toppings);
    numToppings = 0;
    for (String s : toppings) {
      if (s != null && !(s.equals("zzz"))) numToppings++;
    }
    String[] tmp = new String[numToppings];
    int index = 0;
    for (String s : toppings) {
      if (s != null && !(s.equals("zzz"))) {
        tmp[index] = s;
        index++;
      }
    }
    toppings = tmp;
  }

  public int getNumToppings() {
    return numToppings;
  }

  public void printTopping() {
    for (int i = 0; i < toppings.length; i++) System.out.println("" + (i + 1) + ". " + toppings[i]);
  }
  /*
  public boolean addTopping(String topping) {
    if (numToppings > 15) return false;




    return true;
  }
  */
  public int binarySearch(String s) {
    int lower, middle, upper;
    middle = 0;
    lower = 0;
    upper = toppings.length - 1;
    while (!(toppings[middle].equals(s))) {
      middle = upper / 2;
      if(middle == lower) middle++;
      System.out.println("" + lower + " " + middle + " " + upper);
      if (s.compareTo(toppings[middle]) > 0) lower += middle;
      else upper = middle;
      System.out.println("" + lower + " " + middle + " " + upper);
      if(lower > toppings.length || (middle == 1 && !toppings[middle].equals(toppings[1]))) return -1;
    }
    return middle;
  }
}

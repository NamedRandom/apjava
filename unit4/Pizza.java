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
}

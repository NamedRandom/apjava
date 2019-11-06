import java.util.*;

class Pizza {

  private final int MAX = 15;
  public String[] toppings;
  private int numToppings;

  public Pizza(String[] t) {
    ArrayList<String> tmp = new ArrayList<String>();
    for (String s : t) if (tmp.size() <= MAX && s != null && !s.equals("zzz")) tmp.add(s);
    toppings = tmp.toArray(new String[0]);
    sort();
    numToppings = toppings.length;
  }

  public int getNumTopping() {
    return numToppings;
  }

  public void printTopping() {
    // for (int i = 0; i < toppings.length; i++) System.out.println("" + (i + 1) + ". " +
    // toppings[i]);
    System.out.println(Arrays.toString(toppings));
  }

  public void sort() {
    for (int i = (toppings.length - 1); i >= 0; i--) {
      for (int j = 1; j <= i; j++) {
        if (toppings[j - 1].compareTo(toppings[j]) > 0) {
          String temp = toppings[j - 1];
          toppings[j - 1] = toppings[j];
          toppings[j] = temp;
        }
      }
    }
    numToppings = toppings.length;
  }

  public boolean addTopping(String topping) {
    if (numToppings >= 15 || topping == null || topping.equals("zzz")) return false;
    String[] tmp = new String[toppings.length + 1];
    for (int i = 0; i < toppings.length; i++) tmp[i] = toppings[i];
    tmp[toppings.length] = topping;
    toppings = tmp;
    sort();

    return true;
  }

  public int binarySearch(String s) {
    if (s == null) return -1;
    return binarySearch(s, 0, toppings.length - 1);
  }

  public int binarySearch(String s, int lower, int upper) {
    int middle = lower + (upper - lower) / 2;
    int compare = s.compareTo(toppings[middle]);

    // check if all 3 numbers are the same AND toppings[middle]
    // isnt what we are looking for
    if (lower == middle && middle == upper && !toppings[middle].equals(s)) return -1;
    // check if we found the index of s
    if (compare == 0) return middle;
    /*
     * if compare is greater than 0, that means our String s comes
     * after the middle we just compared to and we go to the "upper"
     * or right side of the array, setting the lower bound to
     * the current middle, except +1, since we already checked middle
     *
     */
    if (compare > 0) return binarySearch(s, middle + 1, upper);
    // if it's less than 0, we just send the middle-1 as the upper
    if (compare < 0) return binarySearch(s, lower, middle - 1);
    // getting here is impossible but there must be a return here
    return -1;
  }
}

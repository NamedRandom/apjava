import java.util.*;

class NamesTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Name> names = new ArrayList<Name>();
    int namecount = 3;
    for (int i = 0; i < namecount; i++) {
      System.out.print("Enter first name: ");
      String first = input.nextLine();
      System.out.print("Enter middle name: ");
      String middle = input.nextLine();
      System.out.print("Enter last name: ");
      String last = input.nextLine();
      Name tempName = new Name(first, middle, last);
      names.add(tempName);
    }
    for (Name n : names)
      System.out.print(
          n.firstMiddleLast()
              + "\n"
              + n.lastFirstMiddle()
              + "\nInitials: "
              + n.initials()
              + "\nLength: "
              + n.length()
              + "\n");
    for (Name n : names)
      for (int i = 0; i < names.size(); i++) {
        Name n2 = names.get(i);
        if (n != n2) System.out.println(n + " equals " + n2 + ": " + n.equals(n2));
      }
  }
}

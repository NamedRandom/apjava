// Students Lab - APCS Array List Lab

import java.io.*;
import java.util.*;

public class StudentsLab {
  public static void main(String args[]) throws FileNotFoundException {
    // Create an ArrayList of the names in our class (Strings are objects)
    // If you are using Scanner with a name with a space use nextLine()
    ArrayList<String> arrOfNames = new ArrayList<String>();
    Scanner inputFile = new Scanner(new File("class names.txt"));
    while (inputFile.hasNextLine()) {
      String name = inputFile.nextLine();
      name = name.trim();
      arrOfNames.add(name);
    }

    //	Use the size method print out the size of the ArrayList
    System.out.println("There are " + arrOfNames.size() + " names in this class");
    printList(arrOfNames);
    removeCh(arrOfNames, 'J');
    System.out.println("\n J was removed\n");
    printList(arrOfNames);
    String[] additionalNames = {"Anna", "Benny", "Olaf", "Seth"};
    addArray(arrOfNames, additionalNames);
    System.out.println("\n With new names\n");
    printList(arrOfNames);
    String oldNm = "Alice";
    String newNm = "**some name**";
    replaceName(arrOfNames, oldNm, newNm);
    System.out.println("\n Replacing " + oldNm + " with " + newNm);
    printList(arrOfNames);

    arrOfNames = removeDup(arrOfNames);
    System.out.println("\n WITHOUT DUPLICATES");
    printList(arrOfNames);
    // Finally using Collections.sort to put all the first names
    // in alphabetical order.  Strings already have a compareTo() method.
    Collections.sort(arrOfNames);
    System.out.println("\n\nALL NAMES IN ORDER: ");

    printList(arrOfNames);
  }

  // Write a method to printList() to print out the list numbered vertically
  public static void printList(ArrayList<String> x) {
    for (String s : x) System.out.println(s);
  }

  // Write a method to delete all names that start with a given character
  // Be careful of duplicates.
  public static void removeCh(ArrayList<String> x, char ch) {
    ArrayList<String> remove = new ArrayList<String>();
    for (String s : x) if (s.charAt(0) == ch) remove.add(s);
    x.removeAll(remove);
  }

  // Write a method to add all the elements in a String array to the ArrayList
  public static void addArray(ArrayList<String> x, String[] names) {
    for (String s : names) x.add(s);
  }

  // Write a method to replace a given name with another name
  public static void replaceName(ArrayList<String> x, String oldOne, String newOne) {
    x.set(x.indexOf(oldOne), newOne);
  }
  //	Write a method to remove duplicates
  public static ArrayList<String> removeDup(ArrayList<String> x) {
    ArrayList<String> out = new ArrayList<String>();
    for (String s : x) if (!out.contains(s)) out.add(s);
    return out;
  }
}

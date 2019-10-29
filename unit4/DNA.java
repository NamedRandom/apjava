import java.util.*;

class DNA {

  static final int MISMATCH = 7;

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    char[] dna1, dna2;

    dna1 =
        new char[] {
          'A', 'C', 'T', 'C', 'T', 'T', 'A', 'G', 'G'
        }; // this set has 2 mismatches forward
    dna2 = new char[] {'G', 'C', 'C', 'C', 'T', 'T', 'A', 'G', 'G'};

    //    dna1 = new char[] {'A', 'C', 'T', 'C', 'T', 'T', 'A', 'G', 'G'}; // this set only matches
    // backward
    //    dna2 = new char[] {'G', 'G', 'A', 'T', 'T', 'C', 'T', 'C', 'A'};

    //    dna1 = new char[]{}; //this errors because of a length mismatch
    //    dna2 = new char[]{'A'};

    //    dna1 = new char[]{'A','C','T','C','T','T','A','G','G'}; //this set matches perfectly
    //    dna2 = new char[]{'A','C','T','C','T','T','A','G','G'};

    /*
        System.out.print("Enter DNA1:");
        dna1 = input.nextLine().toCharArray();
        System.out.print("Enter DNA2:");
        dna2 = input.nextLine().toCharArray();
    */
    System.out.println(
        "You entered:\nDNA1: " + Arrays.toString(dna1) + "\nDNA2: " + Arrays.toString(dna2));

    if (dna1.length != dna2.length) {
      System.out.println("Length Mismatch!");
      return;
    }

    int mismatchCount = 0;
    int backMismatchCount = 0;

    for (int i = 0; i < dna1.length; i++) {
      if (dna1[i] != dna2[i]) mismatchCount++;
    }
    for (int i = dna1.length - 1; i >= 0; i--) {
      if (dna1[i] != dna2[dna2.length - 1 - i]) backMismatchCount++;
    }
    if (mismatchCount > MISMATCH && backMismatchCount > MISMATCH)
      System.out.println(
          "DNA1 does not match with DNA2, "
              + mismatchCount
              + " mismatches forward, "
              + backMismatchCount
              + " mismatches backward");
    if (mismatchCount <= MISMATCH)
      System.out.println(
          "DNA1 matches with DNA2 forward with "
              + mismatchCount
              + " mismatches out of "
              + MISMATCH);
    if (backMismatchCount <= MISMATCH)
      System.out.println(
          "DNA1 matches with DNA2 backward with "
              + backMismatchCount
              + " mismatches out of "
              + MISMATCH);
  }
}

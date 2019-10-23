import java.util.*;

class DNA{
    static final int length=10;
    static final int mismatch=3;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        char[] dna1 = new char[length];
        char[] dna2 = new char[length];

        System.out.println("Enter DNA1:");
        dna1=input.nextLine().toCharArray();
        System.out.println("Enter DNA2:");
        dna2=input.nextLine().toCharArray();
        System.out.println("You entered:\nDNA1: "+Arrays.toString(dna1)+"\nDNA2: "+Arrays.toString(dna2));
/*
        dna1 = new char[]{'A','C','T','C','T','T','A','G','G'};
        dna2 = new char[]{'G','C','C','C','T','T','A','G','G'};
*/
        int mismatchCount=0;
        int backMismatchCount=0;

        for(int i=0;i<dna1.length;i++){
            if(dna1[i]!=dna2[i]) mismatchCount++;
        }
        for(int i=dna1.length-1;i>=0;i--){
            if(dna1[i]!=dna2[i]) backMismatchCount++;
        }
        if(mismatchCount>mismatch&&backMismatchCount>mismatch) System.out.println("DNA1 does not match with DNA2");
        if(mismatchCount<=mismatch) System.out.println("DNA1 matches with DNA2 forward with "+mismatchCount+" mismatches ("+mismatch+" mismatches allowed)");
        if(backMismatchCount<=mismatch) System.out.println("DNA1 matches with DNA2 backwards with "+backMismatchCount+" mismatches ("+mismatch+" mismatches allowed)");
    }
}

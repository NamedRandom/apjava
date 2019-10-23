import java.util.*;

class DNA{

    static final int mismatch=0;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        char[] dna1,dna2;

        System.out.print("Enter DNA1:");
        dna1=input.nextLine().toCharArray();
        System.out.print("Enter DNA2:");
        dna2=input.nextLine().toCharArray();
        System.out.println("You entered:\nDNA1: "+Arrays.toString(dna1)+"\nDNA2: "+Arrays.toString(dna2));

        if(dna1.length!=dna2.length){
            System.out.println("Length mismatch!");
            return;
        }

        int mismatchCount=0;
        int backMismatchCount=0;

        for(int i=0;i<dna1.length;i++){
            if(dna1[i]!=dna2[i]) mismatchCount++;
        }
        for(int i=dna1.length-1;i>=0;i--){
            if(dna1[i]!=dna2[dna2.length-1-i]) backMismatchCount++;
        }
        if(mismatchCount>mismatch&&backMismatchCount>mismatch) System.out.println("DNA1 does not match with DNA2, "+mismatchCount+" mismatches forward, "+backMismatchCount+" mismatches backward");
        if(mismatchCount<=mismatch) System.out.println("DNA1 matches with DNA2 forward with "+mismatchCount+" mismatches out of "+mismatch);
        if(backMismatchCount<=mismatch) System.out.println("DNA1 matches with DNA2 forward with "+backMismatchCount+" mismatches out of "+mismatch);
    }
}

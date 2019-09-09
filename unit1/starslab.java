class starslab{
    public static void main(String[] args){
        /*
        genRow is a for loop to make arg1 spaces then arg2 stars,
        can be used to make spaced or non-spaced star lines OR empty lines
        (acting as a wrapper for System.out.println())
         */
        printSquareOnDiagonal(9);
        printSquareOnDiagonal(5);
        printSquareOnDiagonal(4);
        printSquareOnDiagonal(8);

        printTriangle(6);
        printTriangle(10);
        printTriangle(14);

        printArrowhead(3);
        printArrowhead(7);
        printArrowhead(4);
    }
    public static void printArrowhead(int width){
        for(int i=0;i<width;i++)
            genRow(0,i);
        for(int i=width-2;i>=0;i--)
            genRow(0,i);
        genRow(0,-1);
    }
    public static void printTriangle(int rows){
        for(int i=0;i<rows;i++)
            genRow(-2,i);
        genRow(0,-1);
    }
    public static void printSquareOnDiagonal(int w){
        int maxChars=w-2;
        int i=0;
        if(w%2==0){
            maxChars++;
            i=-1;
        }
        for(;i<w;i+=2){
            genRow(maxChars,i);
            maxChars-=2;
        }
        maxChars=1;
        for(i=w-3;i>=0;i-=2){
            genRow(maxChars,i);
            maxChars+=2;
        }
        genRow(0,-1);
    }
    public static void genRow(int spaces, int stars){
        String space=" ";
        if(spaces == -2) space="";
        for(;spaces>=0;spaces--) System.out.print(space);
        for(;stars>=0;stars--) System.out.print("*"+space);
        System.out.println();
    }
}

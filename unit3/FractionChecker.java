import java.util.*;

class FractionChecker{
    public static void main(String[] args){
        int n, d;
        Random rand = new Random();
        Fraction[] f = new Fraction [20];
        for (int j= 0; j<20; j++){
        n = rand.nextInt(20);
        d = rand.nextInt(19)+1;  // denominators cannot be 0
        f[j] = new Fraction (n,d);
        }
        System.out.println(Arrays.toString(f));
        Arrays.sort(f);
        System.out.println("Sorted Array:\nFraction\t\tDecimal Value");
        for(int i=0;i<f.length;i++){
            System.out.println(""+i+")"+"\t"+f[i]+"\t\t"+f[i].decimalValue());
        }
    }
}

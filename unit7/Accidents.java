import java.util.*;

public class Accidents{
    static final int DAYS = 31;
    static final int HOURS = 24;
    private int[][] accidents;

    public Accidents(){
        Random rng = new Random();
        accidents = new int[DAYS][HOURS];
        for(int i=0;i<accidents.length;i++)
            for(int j=0;j<accidents[0].length;j++)
                accidents[i][j]=rng.nextInt(10);
    }
    public void printAccidents(){
        System.out.print("Hours:\n      ");
        for(int i=0;i<accidents[0].length;i++) System.out.print((i<10 ? " ":"")+" "+(i+1));
        System.out.println();
        for(int i=0;i<accidents.length;i++){
            System.out.print((i<10 ? " " : "")+"Day "+i+": ");
            for(int j=0;j<accidents[0].length;j++)
                System.out.print(accidents[i][j]+"  ");
            System.out.println();
        }

    }
    public void totalAccidents(){
        int sum = 0;
        for(int i=0;i<accidents.length;i++)
            for(int j=0;j<accidents[0].length;j++)
                sum+=accidents[i][j];

        System.out.println("Total Accidents: "+sum);
    }
    public void mostAccidentsHour(){
        int max = 0;
        int hourOfMax = 0;
        int sum;
        for(int i=0;i<accidents[0].length;i++){
            sum = 0;
            for(int j=0;j<accidents.length;j++)
                sum+=accidents[j][i];
            if(sum>max){
                max=sum;
                hourOfMax = i;
            }
        }
        System.out.println("Most accidents occur at "+((hourOfMax+1)>12 ? (hourOfMax+1)==24 ? "midnight." : (hourOfMax+1)%12+" PM." : hourOfMax+1+" AM."));
    }
}


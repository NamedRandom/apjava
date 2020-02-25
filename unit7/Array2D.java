import java.util.*;

class Array2D{
    private int arr[][];

    public Array2D(int[][] a){
        arr = a;
    }
    public void printArray(){
        System.out.println(this);
    }
    public String toString(){
        String s = new String();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
                s+=arr[i][j];
            s+="\n";
        }
        return s;
    }
    public int max(){
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
                if(arr[i][j]>max) max = arr[i][j];
        return max;
    }
    public int min(){
        int min = arr[0][0];
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
                if(arr[i][j]<min) min = arr[i][j];
        return min;
    }
    public double median(){
        int[] tmp = new int[arr.length*arr[0].length];
        int index = 0;
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
                tmp[index++] = arr[i][j];

        Arrays.sort(tmp);
        if(tmp.length%2!=0) return tmp[tmp.length/2];
        return (tmp[tmp.length/2]+tmp[tmp.length/2-1])/2;
    }
    public int mode(){
        int[] tmp = new int[max()-min()];
        int offset = Math.abs(min());
        int index = 0;
        for(int[] a:arr)
            for(int i:a)
                tmp[offset+i]++;

        int max = 0;
        for(int i:tmp) max = i>max-offset ? i : max;
        return max;
    }
    public int closestToZero(){
        int closest = arr[0][0];
        for(int[] a : arr)
            for(int i : a)
                if(Math.abs(i)<Math.abs(closest)) closest=i;
        return closest;
    }
    public double average(){
        int sum = 0;
        for(int[] a : arr)
            for(int i : a)
                sum+=i;
        return sum/(double)arr.length;
    }
    public void biggerThanAverage(){
        double avg = average();
        for(int[] a : arr)
            for(int i : a)
                if(i>avg)System.out.println(i);
    }
    public int sumRow(int r){
        if(r<0||r>arr.length) return -1;
        int sum = 0;
        for(int i=0;i<arr[0].length;i++) sum+=arr[r][i];
        return sum;
    }
    public int sumCol(int c){
        if(c<0||c>arr[0].length) return -1;
        int sum = 0;
        for(int i=0;i<arr.length;i++) sum+=arr[i][c];
        return sum;
    }
    public int sumMain(){
        if(arr.length!=arr[0].length) return -1;
        int sum = 0;
        int row = 0;
        int col = 0;
        while(col++<arr.length&&row++<arr.length) sum+=arr[row][col];
        return sum;
    }
    public int sumMinor(){
        if(arr.length!=arr[0].length) return -1;
        int sum = 0;
        int row = arr.length-1;
        int col = 0;
        while(col++<arr.length&&row--<arr.length) sum+=arr[row][col];
        return sum;
    }
}

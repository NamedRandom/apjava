class Array2D{
    private int arr[][];

    public Array2D(int row, int col){
        arr = new int[row][col];
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

    }
}

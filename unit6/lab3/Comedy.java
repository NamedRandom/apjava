class Comedy extends Movie{
    int avgLaughs;

    public Comedy(String t,int s,int avg){
        super(t,s);
        avgLaughs=avg;
    }
    public int getAvgLaughs(){ return avgLaughs; }
    public String toString(){ return super.toString() + "with "+avgLaughs+" laughs on average"; }
    public String getGenre(){ return "Comedy"; }
}
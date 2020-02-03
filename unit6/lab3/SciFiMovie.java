class SciFiMovie extends Movie{
    double plotComplexity;

    public SciFiMovie(String title,int score, double complexity){
        super(title,score);
        plotComplexity=complexity;
    }
    public double getLevel(){ return plotComplexity; }
    public String toString(){ return super.toString() + " plot complexity of "+plotComplexity; }
    public String getGenre(){ return "Sci-Fi"; }
}
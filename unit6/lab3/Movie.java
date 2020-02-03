import java.util.*;

public abstract class Movie implements Comparable<Movie>{
    int score;
    String title;

    public Movie(String t,int s){
        score=s;
        title=t;
    }
    public String getTitle(){ return title; }
    public int getScore(){ return score; }
    public int compareTo(Movie o){ return o.getScore()==score ? 0 : o.getScore()>score ? 1 : -1; }
    public String toString(){ return "\""+title+"\" Score: "+score; }
    public abstract String getGenre();
}
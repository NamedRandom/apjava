class MovieTrilogy extends Movie{
    Movie[] movies;

    public MovieTrilogy(Movie m1,Movie m2,Movie m3){
        super(m1.getTitle()+"/"+m2.getTitle()+"/"+m3.getTitle(),(m1.getScore()+m2.getScore()+m3.getScore())/3);
        movies[0]=m1;
        movies[1]=m2;
        movies[2]=m3;
    }
    public String getGenre() {
        int i = 0;
        while (i < movies.length - 1 && movies[i].getGenre().equals(movies[i + 1].getGenre())) i++;
        return i == movies.length ? "Trilogy (" + movies[0].getGenre() + ")" : "Trilogy";
    }
}
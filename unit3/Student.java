class Student implements Gradable
{
    String name;
    Double testScore;
    Integer testCount;

    Student(String name){
        if(name!=null){
            this.name = name;
        }
        testScore = 0.0;
        testCount = 0;
    }
    String getName(){
        return name;
    }
    void addTestScore(double score){
        testScore += Double.valueOf(score);
        testCount++;
    }
    public Double getPercent(){
        return testScore/testCount;
    }
    public Boolean isPassing(){
        return getPercent()>=60;
    }
}

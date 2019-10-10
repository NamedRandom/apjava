class DriversEd implements Gradable
{
    String name;
    Integer points;
    DriversEd(String name)
    {
        this.name = name;
        points=100;
    }
    void deductPoints(int num)
    {
        if(points>0)
            points-=num;
    }
    String getName()
    {
        return name;
    }
    public Double getPercent()
    {
        return Double.valueOf(points);
    }
    public Boolean isPassing()
    {
        return points>=85;
    }
}

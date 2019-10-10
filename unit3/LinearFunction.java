class LinearFunction implements LinearFunctionMethods
{

    private double m,b;

    LinearFunction(double m,double b)
    {
        this.m=m;
        this.b=b;
    }
    public double getSlope()
    {
        return m;
    }
    public double getYIntercept()
    {
        return b;
    }
    public double getRoot()
    {
        return -b/m;
    }
    public double getYvalue(double x)
    {
        return m*x+b;
    }
    public double getXvalue(double y)
    {
        return (y-b)/m;
    }
    public String toString()
    {
        if(b==0) return "y="+m+"x";
        if(b<0) return "y="+m+"x"+b;
        return "y="+m+"x+"+b;
    }
}

class Name{

    private String first="";
    private String last="";
    private String middle="";

    Name(){}

    Name(String f,String m,String l){
        first=f;
        middle=m;
        last=l;
    }
    public String getFirst(){
        return first;
    }
    public String getMiddle(){
        return middle;
    }
    public String getLast(){
        return last;
    }
    public String firstMiddleLast(){
        return first+" "+middle+" "+last;
    }
    public String lastFirstMiddle(){
        return last+" "+first+" "+middle;
    }
    public boolean equals(Name that){
        return firstMiddleLast().equalsIgnoreCase(that.firstMiddleLast());
    }
    public String initials(){
        return first.toUpperCase().substring(0,1)+middle.toUpperCase().substring(0,1)+last.toUpperCase().substring(0,1);
    }
    public int length(){
        return firstMiddleLast().trim().length();
    }
}

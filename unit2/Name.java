class Name{

    private String first;
    private String last;
    private String middle;

    Name(){
        first="";
        last="";
        middle="";
    }

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
        if(middle.equals("")) return first+" "+last;
        return first+" "+middle+" "+last;
    }
    public String lastFirstMiddle(){
        if(middle.equals("")) return last+" "+first;
        return last+" "+first+" "+middle;
    }
    public boolean equals(Name that){
        return firstMiddleLast().equalsIgnoreCase(that.firstMiddleLast());
    }
    public String initials(){
        if(middle.equals("")) return first.toUpperCase().substring(0,1)+last.toUpperCase().substring(0,1);
        return first.toUpperCase().substring(0,1)+middle.toUpperCase().substring(0,1)+last.toUpperCase().substring(0,1);
    }
    public int length(){
        return firstMiddleLast().trim().length();
    }
    public String toString(){
        return firstMiddleLast();
    }
}

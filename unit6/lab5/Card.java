class Card implements Comparable<Card>{
    public Card(){
        name = "";
    }
    public Card(String n) {
        name = n;
    }
    public boolean isExpired(){
        return false;
    }
    public void printCard(){
        System.out.print("Card holder: " + name);
    }
    private String name;

    public int compareTo(Card other){
        return name.compareTo(other);
    }
    public String toString(){
        return "Card name="+name;
    }
    public boolean equals(Card o){
        return name.equals(o);
    }
    public Card clone(){
        return new Card(name);
    }
}

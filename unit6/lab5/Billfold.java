class Billfold{
    Card card1,card2;

    public Billfold(){}
    public Billfold(Card c1, Card c2){
        card1=c1;
        card2=c2;
    }

    public boolean addCard(Card other){
        if(card1==null) {
            card1 = other;
            return true;
        }
        if(card2==null){
            card2 = other;
            return true;
        }
        return false;
    }
    public void printCards(){
        if(card1!=null) card1.printCard();
        if(card2!=null) card2.printCard();
    }
    public void printExpiredCards(){
        if(card1.isExpired()) card1.printCard();
        if(card2.isExpired()) card2.printCard();
    }
}
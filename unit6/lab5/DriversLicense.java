import java.time.LocalDate;

class DriversLicense extends Card{
    int expirationYear;

    public IDCard(String name,int year){
        super(name);
        expirationYear=year;
    }
    public void printCard(){
        super.print();
        System.out.println(" Expiration Year: "+expirationYear);
    }
    public boolean isExpired(){
        return expirationYear<(new LocalDate()).getYear();
    }
}
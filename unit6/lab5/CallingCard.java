class PhoneCard extends Card{
    int phoneNum;

    public IDCard(String name,int num){
        super(name);
        phoneNum=num;
    }
    public void printCard(){
        super.print();
        System.out.println(" Phone Number: "+phoneNum);
    }
}
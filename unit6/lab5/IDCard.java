class IDCard extends Card{
    int idNum;

    public IDCard(String name,int id){
        super(name);
        idNum=id;
    }
    public void printCard(){
        super.print();
        System.out.println(" ID: "+idNum);
    }
}
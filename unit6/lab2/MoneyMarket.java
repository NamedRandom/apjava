class MoneyMarket extends Savings{

    private int numWithdrawals;

    public MoneyMarket(int acctNum, String name, double bal, double rate){
        super(acctNum,name,bal,rate);
        numWithdrawals = 0;
    }

    public void deductPenalty(){
        if(numWithdrawals>3) this.withdraw(this.getBalance()*.01);
    }
    public void withdraw(double amt){
        changeBalance(amt);
        numWithdrawals++;
    }

}

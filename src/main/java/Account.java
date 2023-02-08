public class Account {
    private String owner;
    private double amount;


    public Account(String accountOwner) {
        this.owner = accountOwner;
        this.amount = 100.000;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //credit = aufbuchen
    public void credit(double value){
        amount = amount + value;
    }

    public boolean debit(double valueMinus){
        if ( valueMinus >= amount){
            amount = amount - valueMinus;
            return true;
        } else {
            return false;
        }

    }

}

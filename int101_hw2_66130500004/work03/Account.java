public class Account {
    private static long nextNo=100_000_000l;
    private final long no;
    private Person owner;
    private double balance;

    public Account(Person owner){
        if (owner==null) {
            throw new NullPointerException();
        }else{
            this.owner=owner;
            this.balance=0;
            Utilitor result=new Utilitor();
            result.computeIsbn10(nextNo);
            
            for (int i = 1; i >0; i++) {
                if (result.computeIsbn10(nextNo)==10) {
                    nextNo++;
                }else{
                    break;
                }
            }
            no=10*nextNo+result.computeIsbn10(nextNo);
            nextNo++;
            
        }
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        Utilitor amountobj=new Utilitor();
        amountobj.testPositive(amount);
        balance=balance+amount;
        return balance;
    }

    public double withdraw(double amount){
        Utilitor amountobj=new Utilitor();
        amountobj.testPositive(amount);
        balance=balance-amount;
        return balance;
    }

    public void transfer(double amount, Account account){
        if (account==null) {
            throw new IllegalArgumentException();
        }else{
            this.withdraw(amount);
            account.deposit(amount);
        }
        
    }

    
    @Override
    public String toString() {
        return "Account [no=" + no + ", balance=" + balance + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    
}

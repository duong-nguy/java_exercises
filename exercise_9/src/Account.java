
public class Account {
    private String owner;
    private int balance, accountNumer;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumer() {
        return accountNumer;
    }

    public void setAccountNumer(int accountNumer) {
        this.accountNumer = accountNumer;
    }

    public Account(String owner, int balance, int accountNumer) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumer = accountNumer;
    }

    public static void transfer(Account from, Account to, int amount) throws NotEnoughMoneyException {
        if (from.balance < amount)
            throw new NotEnoughMoneyException();
        from.setBalance(from.getBalance() - amount);
        to.setBalance(amount);

    }

}

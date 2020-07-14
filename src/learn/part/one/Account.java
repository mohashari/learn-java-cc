package learn.part.one;

import java.math.BigDecimal;

public class Account {

    private BigDecimal balance = new BigDecimal(1000);

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public void removeMoney(BigDecimal cashValue) {
        if (cashValue.compareTo(balance) < 0)
            this.balance.subtract(cashValue);
        System.out.println("Balance not enough");
    }
}

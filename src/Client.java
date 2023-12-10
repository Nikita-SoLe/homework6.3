import java.math.BigDecimal;

abstract class Client {
    private BigDecimal balance;
    abstract void addMoney(BigDecimal money);
    abstract boolean withdrawMoney(BigDecimal money);
    abstract BigDecimal getBalance();
    abstract void getInfo();
}

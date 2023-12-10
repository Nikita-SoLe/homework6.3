import java.math.BigDecimal;

public class Individuals extends Client {
    private BigDecimal balance;

    public Individuals() {
        balance = BigDecimal.ZERO;
    }
    @Override
    public void addMoney(BigDecimal money) {
        balance = balance.add(money);
        System.out.println("Успешно внесенно: " + balance.doubleValue() + " руб.");
    }
    @Override
    public boolean withdrawMoney(BigDecimal money) {
        if (balance.compareTo(money) >= 0) {
            balance = balance.subtract(money);
            System.out.println("С вашего счета снято: "+money.doubleValue()+" руб.");
            return true;
        }
        System.out.println("Недостаточно средств на счету.");
        return false;
    }
    @Override
    public BigDecimal getBalance() {
        return balance;
    }
    @Override
    public void getInfo() {
        System.out.println("Снятие и пополнение без комиссии.");
        System.out.println("Ваш баланс: "+balance.doubleValue()+" руб.");
        System.out.println();
    }
}

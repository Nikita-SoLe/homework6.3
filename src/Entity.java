import java.math.BigDecimal;

public class Entity extends Client{
    private BigDecimal balance;
    public Entity() {
        balance = BigDecimal.ZERO;
    }
    @Override
    public void addMoney(BigDecimal money) {
        balance = balance.add(money);
        System.out.println("Успешно внесенно: "+balance.doubleValue()+" руб.");
    }

    @Override
    public boolean withdrawMoney(BigDecimal money) {
        money =  money.add(BigDecimal.valueOf(money.doubleValue() * 0.01));
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
        System.out.println("Пополнение без комиссии.");
        System.out.println("Комиссия на снятие 1%.");
        System.out.println("Ваш баланс: "+balance.doubleValue()+" руб.");
        System.out.println();
    }
}

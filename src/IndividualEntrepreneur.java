import java.math.BigDecimal;

public class IndividualEntrepreneur extends Client{
    private BigDecimal balance;
    public IndividualEntrepreneur() {
        balance = BigDecimal.ZERO;
    }
    @Override
    public void addMoney(BigDecimal money) {
        if (money.doubleValue() < 1000)
            money = money.subtract(BigDecimal.valueOf(money.doubleValue() * 0.01));
        else
            money = money.subtract(BigDecimal.valueOf(money.doubleValue() * 0.005));

        balance = balance.add(money);
        System.out.println("Успешно внесенно: "+balance.doubleValue()+" руб.");
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
    BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void getInfo() {
        System.out.println("Снятие со счета без комиссии.");
        System.out.println("Пополнение: сумма меньше 1000 руб - 1%, в ином случае - 0.5%");
        System.out.println("Ваш баланс: "+balance.doubleValue()+" руб.");
        System.out.println();
    }
}

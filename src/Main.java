import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal add1 = BigDecimal.valueOf(20000),
                   add2 = BigDecimal.valueOf(30000),
                   add3 = BigDecimal.valueOf(15000),

             subtract1 = BigDecimal.valueOf(10000),
             subtract2 = BigDecimal.valueOf(20000),
             subtract3 = BigDecimal.valueOf(50000);

        Individuals person1 = new Individuals();
        Entity person2 = new Entity();
        IndividualEntrepreneur person3 = new IndividualEntrepreneur();


        person1.addMoney(add1);
        person2.addMoney(add2);
        person3.addMoney(add3);
        System.out.println();

        person1.getInfo();
        person2.getInfo();
        person3.getInfo();
        System.out.println();

        person1.withdrawMoney(subtract1);
        person2.withdrawMoney(subtract2);
        person3.withdrawMoney(subtract1);
        System.out.println();

        person1.getInfo();
        person2.getInfo();
        person3.getInfo();
        System.out.println();

        person1.withdrawMoney(subtract3);
        person2.withdrawMoney(subtract3);
        person3.withdrawMoney(subtract3);
    }
}
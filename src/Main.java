public class Main {
    public static void main(String[] args) {
        int balance = 300; //руб
        int refill = 3300; //руб
        int accrueBonus = 100; //за каждых 100 руб бонус
        int bonus;
        if (refill > 1000) {
            bonus =  refill / accrueBonus;
        } else {
            bonus = 0;
        }
        int totalBalance = balance + refill + bonus;
        System.out.println("Итого баланс:" + totalBalance);
        System.out.println("Итого бонус:" + bonus);
    }
}
// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете превысила ли
// сумма пополнения порог и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.
public class Main {
    public static void main(String[] arg) {

    //вход
        int balance = 100;
        int replenishmentAmount = 1120;

    //логика
        int bonus;
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
        }
        else {
            bonus = 0;
        }
        System.out.println("Ваш бонус равен: " + bonus + " рублей");

        int  totalAmount = balance + replenishmentAmount + bonus;
        System.out.println("Итоговая сумма на вашем счету: " + totalAmount + " рублей");
    }
}


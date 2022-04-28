public class Main {
    public static void main(String[] args) {
        int initialSum = 100;
        int amountCredited = 1100;
        int bonus;
        if (amountCredited > 1000) {
            bonus = amountCredited / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет:" + (initialSum + amountCredited + bonus) + "руб.");
        System.out.println("Начислено бонусных рублей:" + bonus + "руб.");
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Бонус");
        int price = 50_000; // Стоимость билета
        int condition = 20; // Колличество рублей потраченных для начисления 1 милли
        int miles = 1; // Колличество миль начисляемых за каждые потраченные 20 рублей
        int bonus = price / condition * miles; // Сколько бонусов должен получить человек
        System.out.println(bonus + " рублей");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Бонус");
        int x = 50_000; // x - стоимость билета
        int y = 20; // y - колличество рублей потраченных для начисления милль
        int z = 1; // z - колличество миль начисляемых за каждые потраченные "y" рублей
        int bonus = x / y * z; // bonus - сколько бонусов должен получить человек
        System.out.println(bonus);
        System.out.println("Рублей");
    }
}
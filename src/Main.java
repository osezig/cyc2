public class Main {
    public static void main(String[] args) {
        // Задание 1
        int i = 1;
        int salary = 15_000;
        int total = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;

            System.out.println("Месяц " + i + ", сумма накопление " + total + " рублей");
            i++;

        }
    }
}
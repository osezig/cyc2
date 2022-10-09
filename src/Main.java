public class Main {
    public static void main(String[] args) {
        // Задание 4
        int sum = 15000;
        int monthnum = 1;
        while (sum<=12_000_000) {
            sum *= 1.07;
            System.out.println("Месяц " + monthnum + ", сумма накоплений составляет " + sum); monthnum ++;
        }
    }
}



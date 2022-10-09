public class Main {
    public static void main(String[] args) {
        // Задание 5
        int sum = 15000;
        int monthnum = 1;
        while (sum <= 12_000_000) {
                sum *= 1.07;
            if (monthnum % 6 == 0) {
                System.out.println("Месяц " + monthnum + ", сумма накоплений составляет " + sum);
            }
                monthnum++;
            }
        }
    }




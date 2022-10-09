public class Main {
    public static void main(String[] args) {
        // Задание 4
        int sum = 15000;
        int monthnum = 1;
        int i = 0;
        while (sum<=12_000_000) {
            sum = sum * 1.07;
            System.out.println("Год " + i + ", сумма накоплений составляет " + sum); i ++;
        }
    }
}



public class Main {
    public static void main(String[] args) {
        // Задание 3

        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deathRate = 9 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population = population + birthRate - deathRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }
}



public class Main {
    public static void main(String[] args) {
        // Задание 5
        int sum = 15000;
        for (int i = 1; i < 9 * 12; i += 6) {
            int sumBefore = sum;
                sum *= 1 + 0.07 * 6;
                int ss6 = sum - sumBefore;
                System.out.println("Месяц " + i + ", сумма накоплений " +  ss6);
            }
            }
        }





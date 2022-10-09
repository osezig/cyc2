public class Main {
    public static void main(String[] args) {
        // Задание 8
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginning; i < ending; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}





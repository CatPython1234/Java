package Roma_Java;

public class LB9_1_9 {
    public static void main(String[] args) {
        int[] array = new int[200];

        // Заполнение массива случайными значениями от -50 до 50
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101) - 50;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                if (start != end) {
                    System.out.println("Начальный индекс: " + start + ", конечный индекс: " + end);
                }
                start = i + 1;
                end = i + 1;
            } else {
                end++;
            }
        }

        if (start != end) {
            System.out.println("Начальный индекс: " + start + ", конечный индекс: " + end);
        }
    }
}

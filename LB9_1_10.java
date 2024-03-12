package Roma_Java;

public class LB9_1_10 {
    public static void main(String[] args) {
        int[] array = new int[100];
        double positiveSum = 0;
        int positiveCount = 0;

        // Заполнение массива случайными значениями от -100 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveSum += array[i];
                positiveCount++;
            }
        }

        double positiveAverage = positiveSum / positiveCount;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = (int) positiveAverage;
            }
        }

        System.out.println("Массив после замены отрицательных значений:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

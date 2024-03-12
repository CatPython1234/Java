package Roma_Java;
import java.util.Arrays;

public class LB9_1_12 {
    public static void main(String[] args) {
        int[] array = new int[200];

        // Заполнение массива случайными значениями от 0 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        // Сортируем массив в порядке убывания
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        int thirdLargest = array[2];

        System.out.println("Значение третьего по величине элемента: " + thirdLargest);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < thirdLargest) {
                array[i] = thirdLargest;
            }
        }

        System.out.println("Массив после замены:");
        System.out.println(Arrays.toString(array));
    }
}

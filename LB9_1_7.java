package Roma_Java;
import java.util.Arrays;
public class LB9_1_7 {
    public static void main(String[] args) {
        int[] array = new int[200];

        // Заполнение массива случайными значениями от -100 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }

        int start = 0;
        int end = 0;
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                start = i;
                while (i < array.length && array[i] > 0) {
                    i++;
                }
                end = i;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                    if (array[j] < min) {
                        min = array[j];
                    }
                }
                average = (max + min) / 2.0;
                for (int j = start; j < end; j++) {
                    if (array[j] == max || array[j] == min) {
                        array[j] = (int) average;
                    }
                }
            }
        }

        System.out.println("Массив после замены максимального и минимального значения:");
        System.out.println(Arrays.toString(array));
    }
}

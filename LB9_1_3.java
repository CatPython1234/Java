package Roma_Java;
import java.util.ArrayList;
public class LB9_1_3 {
    public static void main(String[] args) {
        int[] array = new int[100];

        // Заполнение массива случайными числами от -100 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }

        ArrayList<Integer> startIndexes = new ArrayList<>();

        int length = 0;
        for (int i = 0; i < array.length; i++) {
            // Если текущий элемент неотрицательный, увеличиваем длину последовательности
            if (array[i] >= 0) {
                length++;
            } else {
                // Если длина последовательности больше 5, добавляем начальный индекс в список
                if (length > 5) {
                    startIndexes.add(i - length);
                }
                length = 0;
            }
        }

        // Вывод начальных индексов
        System.out.println("Начальные индексы непрерывных последовательностей неотрицательных чисел длиной больше 5:");
        for (int index : startIndexes) {
            System.out.println(index);
        }
    }
}

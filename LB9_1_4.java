package Roma_Java;

public class LB9_1_4 {
    public static void main(String[] args) {
        int[] array = new int[200];
        int count = 0;

        // Заполнение массива случайными значениями от -50 до 50
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101) - 50;
        }

        // Подсчет количества пар соседних элементов с одинаковыми значениями
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            }
        }

        System.out.println("Количество пар соседних элементов с одинаковыми значениями: " + count);
    }
}

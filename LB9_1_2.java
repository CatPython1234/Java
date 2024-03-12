package Roma_Java;

public class LB9_1_2 {
    public static void main(String[] args) {
        int[] array = new int[50];

        // Заполнение массива случайными числами от -100 до 100
        for (int i = 0; i < 50; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }

        // Поиск минимального положительного элемента
        int minPositive = 101;
        for (int i = 0; i < 50; i++) {
            if (array[i] > 0 && array[i] < minPositive) {
                minPositive = array[i];
            }
        }

        // Замена отрицательных элементов на минимальное положительное
        for (int i = 0; i < 50; i++) {
            if (array[i] < 0) {
                array[i] = minPositive;
            }
        }

        // Вывод массива
        for (int i = 0; i < 50; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

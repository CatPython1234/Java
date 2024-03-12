package Roma_Java;
import java.util.Arrays;
public class LB9_1_8 {
    public static void main(String[] args) {
        int[] array = new int[100];

        // Заполнение массива случайными значениями от -100 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (array[left] > 0 && left < right) {
                left++;
            }
            while (array[right] < 0 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && i > left && i < right) {
                array[i] = -1; // Placeholder for zeros
            }
        }

        // Sorting zeros
        Arrays.sort(array, left, right);

        // Replacing placeholders with zeros
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                array[i] = 0;
            }
        }

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
}

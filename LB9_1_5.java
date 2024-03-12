package Roma_Java;

public class LB9_1_5 {
    public static void main(String[] args) {
        int[] array = new int[100];

        // Заполнение массива случайными значениями от -100 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }

        int maxSum = 0;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Максимальная сумма элементов в непрерывной последовательности: " + maxSum);
        System.out.println("Непрерывная последовательность с максимальной суммой элементов:");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

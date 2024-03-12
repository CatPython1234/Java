package Roma_Java;

import java.util.Random;

public class LB9_1_1 {
        //Подсчитать количество участков,
        //которые образуют непрерывные
        //последовательности чисел с
        //неуменьшающимися значениями
        public static void main(String[] args) {
            int count = 0;
            int[] array = new int[200];
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(101);
            }

            int start = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    count++;
                    start = i;
                }
            }

            System.out.println("Количество участков: " + count);
        }
    }

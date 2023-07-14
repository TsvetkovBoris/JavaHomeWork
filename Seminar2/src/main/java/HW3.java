// Пусть дан произвольный список целых чисел. Нужно удалить из него чётные числа, найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
public class HW3 {
        public static List<Integer> getRandomList(int size) {

            Random random = new Random();
            List<Integer> randomList = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                randomList.add(random.nextInt(100));
            }

            System.out.println(randomList.toString());
            return randomList;
        }

    public static List<Integer> deleteEvenNum(List<Integer> list) {

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

        }
        System.out.println(list.toString());
        return list;
    }

        public static void getRezult(List<Integer> list) {
            int min = Collections.min(list);
            int max = Collections.max(list);
            int count = list.size();
            int sum = 0;

            for (Integer i : list) {
                sum += i;
            }

            double result = sum / count;

            System.out.printf("Минимальное: %d, максимальное: %d, среднее арифметичское: %.2f\n", min, max, result);

        }

        public static void main(String[] args) {
            getRezult(getRandomList(20));
            deleteEvenNum(getRandomList(20));
        }

}

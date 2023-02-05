import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Homework{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<10; i++){
            list.add(random.nextInt(30));
        }
        System.out.println("Изначальный список: "+list);
        System.out.println("Измененный список: "+removeEvenValues(list));
        System.out.println("Min numbers: "+getMin(list));
        System.out.println("Max numbers: " + getMax(list));
        System.out.println("Average numbers: "+getAverage(list));

    }

        // Удаление четных чисел из списка
        public static List<Integer> removeEvenValues(List<Integer> list) {
            ArrayList<Integer> newList = new ArrayList<>();
            for (Integer i : list) {
                if (i % 2 != 0) {
                    newList.add(i);
                }
            }
            return newList;
        }

// Поиск минимального числа в списке
        public static Integer getMin(List<Integer> list) {
            if (list.isEmpty()) {
                return null;
            }

            int min = list.get(0);
            for (Integer i : list) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        }

// Поиск максимального числа в списке
        public static Integer getMax(List<Integer> list) {
            if (list.isEmpty()) {
                return null;
            }

            int max = list.get(0);
            for (Integer i : list) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }

// Поиск среднего значения в списке
        public static Integer getAverage(List<Integer> list) {
            if (list.isEmpty()) {
                return null;
            }

            int sum = 0;
            for (Integer i : list) {
                sum += i;
            }
            return sum / list.size();
        }
    }
package TaskExamTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//TODO 5.Сортировка по кол-ву цифр
// Компаратор в виде лямбды, работа с ArrayList,
// строки использовать нельзя. Использовать Collections.sort

public class Task5CompSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(12);
        list.add(123213);
        list.add(3);
        list.add(0);

        /// ОТВЕТ!!!!!!!
        Collections.sort(list, ((o1,o2)  -> {
            o1 = Math.abs(o1);
            o2 = Math.abs(o2);

            int count1 = 1;
            int count2 = 1;


            while(o1 >= 10) {
                o1 = o1 / 10;
                count1++;
            }
            while(o2 >= 10) {
                o2 = o2 / 10;
                count2++;
            }
            return count1-count2;
        }));
        /// КОНЕЦ ОТВЕТ!!!!!!!

        System.out.println(list);
    }
}

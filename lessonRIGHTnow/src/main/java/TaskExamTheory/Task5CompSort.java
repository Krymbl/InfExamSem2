package TaskExamTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task5CompSort {

    /// ОТВЕТ!!!!!!!
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(112321);
        list.add(14214);
        list.add(0);
        list.add(112);
        System.out.println(list);

        Collections.sort(list,(o1,o2) -> {
            int count1 = 1;
            int count2 = 1;
            while (o1 >= 10) {
                o1 = o1 / 10;
                count1++;
            }
            while (o2 >= 10) {
                o2 = o2 / 10;
                count2++;
            }

            return o1-o2;
        });

        System.out.println(list);
        ///КОНЕЦ ОТВЕТА!!!!
    }


}

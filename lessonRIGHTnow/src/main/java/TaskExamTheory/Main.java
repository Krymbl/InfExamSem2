package TaskExamTheory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        List<? extends Number> list1 = list;
        System.out.println(list1.get(0));
    }
}

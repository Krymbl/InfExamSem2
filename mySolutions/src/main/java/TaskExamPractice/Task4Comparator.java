package TaskExamPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Компаратор (Comparator) в Java — это интерфейс,
// который позволяет определить пользовательскую логику сравнения объектов.
// Он предоставляет способ сравнить два объекта и определить их порядок,
// что полезно, когда нужно отсортировать коллекции или реализовать
// пользовательские механизмы сортировки

//TODO Написать компоратор

public class Task4Comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(1);

        //Comparator в виде лямбды выражения
        Comparator<Integer> comparator = ((o1, o2) -> {return o1-o2;});

        //Comparator в виде лямбды выражения. ("Анонимная" лямбда функция)
        Collections.sort(list, (o1,o2) -> {return o1-o2;});
        System.out.println(list);

        //Comparator в виде анонимного класса
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };



    }

    //Comparator в виде реализованного класса
    public static class CompGroup implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }


}

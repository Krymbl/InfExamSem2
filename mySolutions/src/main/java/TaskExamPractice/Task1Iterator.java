package TaskExamPractice;

import java.util.Iterator;
import java.util.NoSuchElementException;

//ToDo Реализовать итератор

/**
 * Классический вид Итератора, который мы реализуем
 *
 * Итератор - это паттерн, который предоставляет способ последовательного доступа
 * к элементам коллекции без раскрытия её внутренней структуры.
 *
 * Чтобы мы смогли "Итерировать" класс, нам нужно, чтобы класс реализовывал интерфейс Iterable.
 * У интерфейса Iterable только один метод - public Iterator iterator(){ return new IteratorImpl();}
 * Этот метод как раз возвращает нам Iterator, который мы должны реализовать
 *
 * Мы реализуем интерфейс Iterator в новом классе, пусть класс будет называть IteratorImpl.
 *
 * У интерфейса Iterator только 2 метода:
 * 1. public boolean hasNext() - Проверка, что мы можем перейти к след элементу
 * 2. public T next() - возвращает след элемент типа T.


  public class MyIterator<T> implements Iterable<T> {
        public Iterator<T> iterator() {
            return new IteratorImpl();
    }
        public class IteratorImpl implements Iterator<T> {
            public boolean hasNext() {
                return true;
            }

            public T next() {
                return T;
            }
        }
    }
*/


//Реализуем итератор, который возвращает все элементы массива. Массив типа Integer
public class Task1Iterator {
    public static void main(String[] args) {

        Integer arr[] = {1, 2, 5, 10, 0, 15};
        MyIteratorForArray<Integer> arrIt = new MyIteratorForArray<>(arr);

        //Синтаксический сахар - forEach
        for (Integer x: arrIt) {
            System.out.println(x);
        }

        System.out.println("---------");

        //Классическая реализация
        Iterator<Integer> iterator = arrIt.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    //Итератор. Чтобы внутри нашего класса можно было "Итерировать",
    //нам нужно, чтобы он реализовывал интерфейс Iterable

    ///ОТВЕТ!!!!!!!!!!!!!!!
    public static class MyIteratorForArray<T> implements Iterable<T> {

        private T array[];

        //Конуструктор для работы с массивом
        public MyIteratorForArray(T[] array) {
            this.array = array;
        }

        //Реализуем метод public Iterator iterator - Обязательно нужно реализовать,
        // так как этот метод в Интерфейсе абстрактный
        public Iterator<T> iterator() {
            return new IteratorImpl();
        }

        //Реализуем интерфейс Iterator. Обязательно прописываем методы hasNext() и next()
        public class IteratorImpl implements Iterator<T> {
            private int index = 0;

            public boolean hasNext() {
                return index < array.length;
                //Проверяем, что не зашли за размер массива,
                //то есть проверяем, что есть следующие элементы
            }
            //Возвращаем следующий элемент
            public T next() {
                if (index == array.length) {
                    throw new NoSuchElementException();
                }
                return array[index++];
            }
        }
    }
    ///КОНЕЦ ОТВЕТА!!!!!!!!!!!!!!!
}

package TaskExamTheory;

import java.util.Iterator;

public class Таst1Iterator {
    public static void main(String[] args) {
        Integer arr[] = {1, 2 ,3, 4, 5};
        ArrayIteraor<Integer> itArr = new ArrayIteraor<>(arr);

        for (Integer x: arr) {
            System.out.println(x);
        }
        System.out.println("------");

        Iterator<Integer> iterator = itArr.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static class ArrayIteraor<T> implements Iterable<T> {
        public T arr[];
        int index = 0;

        public ArrayIteraor(T[] arr) {
            this.arr = arr;
        }

        public Iterator<T> iterator() {
            return new MyIterator();
        }

        public class MyIterator implements Iterator<T> {

            public boolean hasNext() {
                return index < arr.length;
            }

            public T next() {
                return arr[index++];

            }
        }
    }
}

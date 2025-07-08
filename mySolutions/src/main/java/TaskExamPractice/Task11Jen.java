package TaskExamPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Task11Jen {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 5 ,10};
        Jeneric<Integer> jen = new Jeneric<>(array);
        System.out.println(Arrays.toString(jen.array));

    }

    public static class Jeneric<T> {
        public T[] array;

        public Jeneric(T[] array) {
            this.array = array;
        }
    }
}

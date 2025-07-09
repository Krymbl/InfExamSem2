package TaskExamTheory;

public class Task11Jeneric {
    public static void main(String[] args) {
        Integer[] array = {1 , 2 , 3, 4};
        Param<Integer> param = new Param<>(array);
        System.out.println(param);

    }

        public static class Param<T>{
        public T[] array;

        public Param(T[] array) {
            this.array = array;
        }
    }
}

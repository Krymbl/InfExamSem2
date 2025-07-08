package TaskExamPractice;

//TODO запустить поток runnable, используя лямбда-выражения
public class Task8Runnable {
    public static void main(String[] args) {

        /// ОТВЕТ!!!!
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Работаем");
            }
        };

        runnable.run();
        /// КОНЕЦ ОТВЕТ!!!!
    }
}

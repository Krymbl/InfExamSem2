package TaskExamPractice;

public class Task8Runnable {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Работаем");
            }
        };

        runnable.run();
    }
}

package TaskExamPractice;

/// DeadLock - ситуация, при которой два или более потока
/// бесконечно ждут ресурсы друг друга, которые нужны им для дальнейшего выполнения

// TODO Реализовать DeadLock
public class Task19DeadLock {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized(lock1) {
                try {
                    System.out.println("11");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("12");
                }

            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            synchronized(lock2) {
                try {
                    System.out.println("21");
                    Thread.sleep(100);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("22");
                }
            }
        });
        thread2.start();
    }
}

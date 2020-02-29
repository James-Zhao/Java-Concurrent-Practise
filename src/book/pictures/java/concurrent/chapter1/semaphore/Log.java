package book.pictures.java.concurrent.chapter1.semaphore;

public class Log {
    public static void println(String s) {
        System.out.println(Thread.currentThread().getName() + ": " + s);
    }
}

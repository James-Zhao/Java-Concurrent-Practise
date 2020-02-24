package book.pictures.java.concurrent.chapter1.two.threads;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("Nice!");
        }
    }
}

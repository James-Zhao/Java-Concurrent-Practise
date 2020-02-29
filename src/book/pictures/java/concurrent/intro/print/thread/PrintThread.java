package book.pictures.java.concurrent.intro.print.thread;

public class PrintThread extends Thread{
    private String message;
    public PrintThread(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(message);
        }
    }
}

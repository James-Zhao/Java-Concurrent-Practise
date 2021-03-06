package book.pictures.java.concurrent.intro.printer;

public class Printer implements Runnable {
    private String message;
    public Printer(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(message);
        }
    }
}

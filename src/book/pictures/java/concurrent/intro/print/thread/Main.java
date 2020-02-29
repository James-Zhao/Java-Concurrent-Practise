package book.pictures.java.concurrent.intro.print.thread;

public class Main {
    public static void main (String[] args) {
        new PrintThread("Good!").start();
        new PrintThread("Nice!").start();
    }
}

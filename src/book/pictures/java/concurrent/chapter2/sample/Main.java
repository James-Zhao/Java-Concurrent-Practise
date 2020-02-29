package book.pictures.java.concurrent.chapter2.sample;

public class Main {
    public static void main (String[] args) {
        Person alice = new Person("alice", "Alaska");
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
    }
}

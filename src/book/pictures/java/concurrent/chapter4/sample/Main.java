package book.pictures.java.concurrent.chapter4.sample;

public class Main {
    public static void main(String[] args) {
        Data data = new Data("data.txt", "(empty)");
        new ChangerThread("ChangerThread", data).start();
        new SaveThread("SaveThread", data).start();
    }
}

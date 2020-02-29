package book.pictures.java.concurrent.chapter2.sample3;

import book.pictures.java.concurrent.chapter2.sample1.ReaderThread;
import book.pictures.java.concurrent.chapter2.sample1.WriterThread;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main (String[] args) {
        final List<Integer> list = new CopyOnWriteArrayList<>();
        new WriterThread(list).start();
        new ReaderThread(list).start();
    }
}

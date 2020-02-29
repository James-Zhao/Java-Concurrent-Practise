package book.pictures.java.concurrent.chapter2.sample2;

import book.pictures.java.concurrent.chapter2.sample1.WriterThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        final List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        new WriterThread(list).start();
        new ReaderThread(list).start();
    }
}

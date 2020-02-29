package book.pictures.java.concurrent.chapter2.sample1;

import java.util.List;

public class WriterThread extends Thread {
    private final List<Integer> list;
    public WriterThread(List<Integer> list) {
        super("WriterThread");
        this.list = list;
    }

    public void run() {
        for (int i = 0; true; i++) {
            list.add(i);
            list.remove(0);
        }
    }
}

package book.pictures.java.concurrent.chapter3.sample1;

import book.pictures.java.concurrent.chapter3.sample.Request;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class RequestQueue {
    private final BlockingQueue<Request> queue = new LinkedBlockingDeque<>();
    public Request getRequest() {
        Request req = null;
        try {
            req = queue.take();
        } catch (InterruptedException e) {
        }
        return req;
    }

    public void putRequest(Request request) {
        try {
            queue.put(request);
        } catch (InterruptedException e) {
        }
    }
}

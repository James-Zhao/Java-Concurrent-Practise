package book.pictures.java.concurrent.chapter1.semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class BoundedResource {
    private final Semaphore semaphore;
    private final int permits;
    private final static Random random = new Random(314159);

    //构造函数 permits为资源数
    public BoundedResource(int permits) {
        this.semaphore = new Semaphore(permits);
        this.permits = permits;
    }

    //使用资源
    public void use() throws InterruptedException {
        semaphore.acquire();
        try {
            doUse();
        } finally {
            semaphore.release();
        }
    }

    //实际使用资源
    protected void doUse() throws InterruptedException {
        Log.println("BEGIN: used = " + (permits - semaphore.availablePermits()));
        Thread.sleep(random.nextInt(500));
        Log.println("END: used = " + (permits - semaphore.availablePermits()));
    }
}

package book.pictures.java.concurrent.chapter4.sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Data {
    private final String fileName;
    private String content;
    private boolean changed;

    public Data(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
        this.changed = true;
    }

    //修改数据内容
    public synchronized void change(String newContent) {
        content = newContent;
        changed = true;
    }

    //若数据被修改过，则保存到文件中
    public synchronized void save() throws IOException {
        if (!changed) {
            return;
        }
        doSave();
        changed = false;
    }

    //将数据内容实际保存到文件中
    private void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName() + " calls doSave, content = " + content);
        Writer writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}

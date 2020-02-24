package book.pictures.java.concurrent.chapter1.thread.factory;

import book.pictures.java.concurrent.chapter1.printer.Printer;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main (String[] args) {
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(new Printer("Nice!")).start();
        for (int i = 0; i < 1000; i++) {
            System.out.print("Good!");
        }
    }
}


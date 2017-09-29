package collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();

        long start;
        long end;
        long duration;

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(() -> {
            System.out.println("Hello, thread is working!");
        });

        start = System.nanoTime();
        linkedList.add("Hello");
        end = System.nanoTime();
        duration = end - start;
        System.out.println("LinkedList: " + duration);

        start = System.nanoTime();
        arrayList.add("Hello");
        end = System.nanoTime();
        duration = end - start;
        System.out.println(" ArrayList: " + duration);
    }
}

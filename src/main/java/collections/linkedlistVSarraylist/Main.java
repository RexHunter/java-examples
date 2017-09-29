package collections.linkedlistVSarraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread();
        th.setDaemon(true);
        List<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> likedList = new LinkedList<>();

        long start, end, duration;

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            likedList.add(i);
        }
        end = System.nanoTime();
        duration = end - start;

        System.out.println("ArrayList: " + duration);

        likedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            likedList.add(i);
        }
        end = System.nanoTime();
        duration = end - start;

        System.out.println("LinkedList: " + duration);
    }
}

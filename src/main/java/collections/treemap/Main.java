package collections.treemap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Mock, Integer> treeMap = new TreeMap<>();

        for (int i = 10; i >= 1; i--) {
            treeMap.put(new Mock(i, "mock" + i), 1);
        }
        treeMap.keySet().forEach(System.out::println);
    }
}

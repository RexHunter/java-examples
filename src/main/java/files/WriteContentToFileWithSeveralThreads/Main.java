package files.WriteContentToFileWithSeveralThreads;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static String FILE_PATH = "data/Threads/FileWriter/output";
    public static AtomicReference<BufferedWriter> aBf;
    public static BufferedWriter bf;

    public static void main(String[] args) throws IOException, InterruptedException {
        createDirStructure();
        aBf = new AtomicReference<>(new BufferedWriter(new FileWriter(new File(FILE_PATH))));
        bf = new BufferedWriter(new FileWriter(new File(FILE_PATH)));

        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 20000; i++) {
//                    aBf.get().write("Hello #" + i + System.getProperty("line.separator"));
                    bf.write("Hello #" + i + System.getProperty("line.separator"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        Thread th = new Thread(runnable);
//        Thread th1 = new Thread(runnable);
        long start = System.nanoTime();
        th.start();
//        th1.start();
        th.join();
//        th1.join();
//        aBf.get().close();
        bf.close();
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Duration: " + (duration));


//        BufferedWriter aBf = new BufferedWriter(fw);
//        aBf.write("Hello");
//        aBf.close();

    }

    private static void createDirStructure() throws IOException {
        new File("data").mkdir();
        new File("data/Threads").mkdir();
        new File("data/Threads/FileWriter").mkdir();
        new File("data/Threads/FileWriter/output").createNewFile();
    }
}

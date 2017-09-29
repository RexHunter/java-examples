package threads.daemonthread;

import java.io.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Thread daemon = new Thread(() -> {
            File file = new File("log");
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(file));
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                for (int i = 0; i < 1000000; i++) {
                    writer.write(("Daemon hello message#" + i));
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

//        daemon.setDaemon(true);
        daemon.start();
    }
}

package files.FileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        createDirStructure();

        File file = new File("data/FileWriter/output");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("Hello");
        bf.close();

    }

    private static void createDirStructure() throws IOException {
        new File("data").mkdir();
        new File("data/FileWriter").mkdir();
        new File("data/FileWriter/output").createNewFile();
    }
}

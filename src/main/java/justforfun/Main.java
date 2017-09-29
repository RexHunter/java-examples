package justforfun;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter(new File("data/FileWriter/output")));

        bf.write("SUPER PUPER TEST");

        bf.close();
    }
}

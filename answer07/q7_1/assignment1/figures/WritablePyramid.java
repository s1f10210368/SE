package assignment1.figures;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import assignment1.base.Writable;

public class WritablePyramid extends Pyramid implements Writable{
    public WritablePyramid(int height) {
        super(height);
    }

    @Override
    public void write(String filename) {
        try {
            File file = new File(filename);
            FileWriter writer = new FileWriter(file);
            for(int i = 0; i < height; i++) {
                String s = " ".repeat(height - i - 1) + "*".repeat(i * 2 + 1);
                writer.write(s + "\n");
            }
            writer.close();
        } catch(IOException e) {
            System.out.println("An error occurs.");
        }
    }
}

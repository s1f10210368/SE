package assignment1;

import assignment1.figures.WritablePyramid;

public class Main {
    public static void main(String[] args) {
        WritablePyramid p = new WritablePyramid(4);
        p.draw();
        p.write("tmp.txt");
    }
}
package assignment1.base;

public class Figure {
    protected final int height;

    public Figure(int height) {
        this.height = height;
    }

    public void draw() {
        for(int i = 0; i < height; i++) {
            System.out.println("");
        }
    }
}

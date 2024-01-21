package assignment1.figures;

import assignment1.base.Figure;

public class Rectangle extends Figure{
    private final int width;

    public Rectangle(int height, int width) {
        super(height);
        this.width = width;
    }

    @Override
    public void draw() {
        for(int i = 0; i < height; i++) {
            String s = "*".repeat(width);
            System.out.println(s);
        }
    }
}

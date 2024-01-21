package assignment1.figures;

import assignment1.base.Figure;

public class Pyramid extends Figure {
    public Pyramid(int height) {
        super(height);
    }

    @Override
    public void draw() {
        for(int i = 0; i < height; i++) {
            String s = " ".repeat(height - i - 1) + "*".repeat(i * 2 + 1);
            System.out.println(s);
        }
    }
}

package assignment1;

public class Pyramid extends Figure {
    Pyramid(int height) {
        super(height);
    }

    void draw() {
        for(int i = 0; i < height; i++) {
            String s = " ".repeat(height - i - 1) + "*".repeat(i * 2 + 1);
            System.out.println(s);
        }
    }
}

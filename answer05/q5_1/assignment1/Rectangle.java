package assignment1;

public class Rectangle extends Figure{
    final int width;

    Rectangle(int height, int width) {
        super(height);
        this.width = width;
    }

    void draw() {
        for(int i = 0; i < height; i++) {
            String s = "*".repeat(width);
            System.out.println(s);
        }
    }
}

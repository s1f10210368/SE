package quiz;

public class Main{
    public static void main(String[] args) {
        Apple apple = new Apple(72.5, 200);
        System.out.printf("%d %f %s\n", apple.getPrice(), apple.getWeight(), apple.getColor());
    }
}
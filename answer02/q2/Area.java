import java.util.Random;

public class Area {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(10);
        double area = r * r * Math.PI;
        System.out.printf("The area of a circle with a radius of %d is %f\n", r, area);
    }
}

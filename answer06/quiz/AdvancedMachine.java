package quiz;

public final class AdvancedMachine extends Machine{
    private static int total = 0;

    public AdvancedMachine(String model, int price) {
        super(model, price);
        total += price;
    }

    public static int getTotalPrice() {
        return total;
    }

    @Override
    public int getPrice() {
        return (int)(price * 1.1);
    }
}

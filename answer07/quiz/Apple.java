package quiz;

public class Apple extends Fruit implements Sellable {
    private int price;
    public Apple(double weight, int price) {
        super(weight);
        this.price = price;
    }

    public String getColor() {
        return "red";
    }

    public int getPrice() {
        return price;
    }
}
package endwxam.two;

public class Beverage {
    private final String name;
    protected final int price;

    public Beverage(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPriceWithTax(){
        return (int) (price * 1.08);
    }
}

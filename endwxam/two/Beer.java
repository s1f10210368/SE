package endwxam.two;

public class Beer extends Beverage {
    public Beer(String name, int price){
        super(name, price);
    }

    @Override
    public int getPriceWithTax(){
        return (int) (price * 1.10);
    }
}

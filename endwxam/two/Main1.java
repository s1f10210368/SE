package endwxam.two;

public class Main1 {
    public static void main(String[] args) {
        Beverage juice = new Beverage("Orange", 100);
        System.out.println(juice.getName());
        System.out.println(juice.getPriceWithTax());
    }
}

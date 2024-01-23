package endwxam.two;

public class Main2 {
    public static void main(String[] args) {
        Beverage beer = new Beer("Asahi", 200);
        System.out.println(beer.getName());
        System.out.println(beer.getPriceWithTax());
    }
}
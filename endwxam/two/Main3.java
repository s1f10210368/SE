package endwxam.two;

public class Main3 {
    public static void main(String args[]) {
        BeverageCase bc = new BeverageCase();
        bc.addBeverage(new Beverage("Orange", 100));
        bc.addBeverage(new Beer("Asahi", 200));
        System.out.println(bc.getTotalPrice());
    }
}

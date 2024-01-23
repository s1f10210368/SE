package endwxam.two;


import java.util.List;
import java.util.ArrayList;

public class BeverageCase {
    private List<Beverage> beverages = new ArrayList<Beverage>();

    public BeverageCase(){

    }

    public void addBeverage(Beverage beverage){
        beverages.add(beverage);
    }

    public int getTotalPrice(){
        int total = 0;
        for (Beverage b : beverages){
            total += b.getPriceWithTax();
        }
        return total;
    }
}



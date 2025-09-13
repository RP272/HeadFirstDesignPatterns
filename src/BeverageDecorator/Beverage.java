package BeverageDecorator;

import java.util.Map;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size;
    Map<Size, Double> prices;

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public void setSize(Size newSize){
        size = newSize;
    }

    public Size getSize(){
        return size;
    }

    public Double getPriceBySize(Size s){
        return prices.get(s);
    }
}

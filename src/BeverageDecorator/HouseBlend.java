package BeverageDecorator;

import java.util.Map;

public class HouseBlend extends Beverage{
    public HouseBlend(Size s){
        description = "House Blend Coffee";
        size = s;
        prices = Map.of(
                Size.TALL, 0.89,
                Size.GRANDE, 1.89,
                Size.VENTI, 2.89
        );
    }
    @Override
    public double cost() {
        return getPriceBySize(size);
    }
}

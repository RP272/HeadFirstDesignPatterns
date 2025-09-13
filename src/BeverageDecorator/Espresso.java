package BeverageDecorator;

import java.util.Map;

public class Espresso extends Beverage{
    public Espresso(Size s){
        description = "Espresso";
        size = s;
        prices = Map.of(
                Size.TALL, 1.99,
                Size.GRANDE, 2.99,
                Size.VENTI, 3.99
        );
    }

    @Override
    public double cost() {
        return getPriceBySize(size);
    }
}

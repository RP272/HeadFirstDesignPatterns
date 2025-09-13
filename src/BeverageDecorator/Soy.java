package BeverageDecorator;

import java.util.Map;

public class Soy extends CondimentDecorator{
    private final Beverage inner;
    public Soy(Beverage beverage, Size s){
        inner = beverage;
        size = s;
        prices = Map.of(
                Size.TALL, 0.15,
                Size.GRANDE, 0.2,
                Size.VENTI, 0.25
        );
    }
    @Override
    public String getDescription() {
        return inner.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return getPriceBySize(size) + inner.cost();
    }
}

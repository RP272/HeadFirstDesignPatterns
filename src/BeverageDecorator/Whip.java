package BeverageDecorator;

import java.util.Map;

public class Whip extends CondimentDecorator{
    private final Beverage inner;
    public Whip(Beverage beverage, Size s){
        inner = beverage;
        size = s;
        prices = Map.of(
                Size.TALL, 0.1,
                Size.GRANDE, 0.15,
                Size.VENTI, 0.2
        );
    }
    @Override
    public String getDescription() {
        return inner.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return getPriceBySize(size) + inner.cost();
    }
}

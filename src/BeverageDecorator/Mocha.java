package BeverageDecorator;

import java.util.Map;

public class Mocha extends CondimentDecorator{
    private final Beverage inner;
    public Mocha(Beverage beverage, Size s){
        inner = beverage;
        size = s;
        prices = Map.of(
                Size.TALL, 0.2,
                Size.GRANDE, 0.25,
                Size.VENTI, 0.3
        );
    }

    @Override
    public String getDescription() {
        return inner.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return getPriceBySize(size) + inner.cost();
    }
}

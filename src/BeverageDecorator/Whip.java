package BeverageDecorator;

public class Whip extends CondimentDecorator{
    private final Beverage inner;
    public Whip(Beverage beverage){
        inner = beverage;
    }
    @Override
    public String getDescription() {
        return inner.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + inner.cost();
    }
}

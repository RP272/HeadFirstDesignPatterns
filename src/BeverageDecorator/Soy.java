package BeverageDecorator;

public class Soy extends CondimentDecorator{
    private final Beverage inner;
    public Soy(Beverage beverage){
        inner = beverage;
    }
    @Override
    public String getDescription() {
        return inner.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + inner.cost();
    }
}

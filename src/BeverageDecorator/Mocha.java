package BeverageDecorator;

public class Mocha extends CondimentDecorator{
    private final Beverage inner;
    public Mocha(Beverage beverage){
        inner = beverage;
    }

    @Override
    public String getDescription() {
        return inner.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + inner.cost();
    }
}

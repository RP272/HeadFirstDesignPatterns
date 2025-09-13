package BeverageDecorator;

import java.util.Map;

public class Mocha extends CondimentDecorator{
    private final Beverage inner;
    public Mocha(Beverage beverage){
        inner = beverage;
    }

    public Size getSize(){
        return inner.getSize();
    }

    @Override
    public String getDescription() {
        return inner.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = inner.cost();
        switch (getSize()){
            case TALL:{
                cost += 0.1;
            }
            case GRANDE:{
                cost += 0.15;
            }
            case VENTI:{
                cost += 0.2;
            }
        }
        return cost;
    }
}

package Pizzeria;

public class ChicagoStylePizzaStore extends AbstractPizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }
}

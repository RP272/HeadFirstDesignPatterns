package Pizzeria;

public class PizzaTestDrive {
    public static void main(String[] args) {
        AbstractPizzaStore nyStore = new NYStylePizzaStore();
        AbstractPizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}

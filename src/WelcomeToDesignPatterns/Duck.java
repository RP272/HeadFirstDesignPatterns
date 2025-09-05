package WelcomeToDesignPatterns;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck(){
    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour behaviour){
        this.flyBehaviour = behaviour;
    }
    public void setQuackBehaviour(QuackBehaviour behaviour){
        this.quackBehaviour = behaviour;
    }
}

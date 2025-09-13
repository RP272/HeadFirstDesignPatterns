package BeverageDecorator;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size;

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public void setSize(Size newSize){
        size = newSize;
    }

    public Size getSize(){
        return size;
    }
}

package SubjectObserverPattern;
import java.util.Observer;
import java.util.Observable;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.2f;
    private float lastPressure;

    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }

    public void display(){
        System.out.println("Last pressure: " + this.lastPressure + " current pressure: " + this.currentPressure);
    }

    public void update(Observable observable, Object arg){
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}

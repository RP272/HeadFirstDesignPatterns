package SubjectObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(12.34f, 35.6f, 1.45f);
        weatherData.setMeasurements(43.21f, 65.3f, 5.41f);
        weatherData.setMeasurements(12.21f, 35.53f, 1.1f);
    }
}


public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData =  new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setWeatherData(60,61,62);
        weatherData.setWeatherData(87,90,100);
        weatherData.setWeatherData(56,66,98);


    }
}
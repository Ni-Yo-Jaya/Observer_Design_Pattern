import java.awt.geom.CubicCurve2D;

public class CurrentConditionDisplay implements Observer,DisplayElement{

    Subjects weatherData;
    float temp;
    float humidity;
    float pressure;

    public CurrentConditionDisplay(Subjects weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);


    }

    @Override
    public void display() {
        System.out.println("Current Weather Conditions :" + temp + "F degrees, " + humidity + "% humidity and " + pressure + "Pa");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}

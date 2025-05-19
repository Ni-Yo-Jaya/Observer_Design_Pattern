import java.util.ArrayList;

public class WeatherData implements Subjects{

    private float temp;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public void setWeatherData(float temp, float humidity, float pressure){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChange();

    }
    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserever(Observer o){

        int index = observers.indexOf(o);
        observers.remove(index);

    }
    public void measurementsChange(){
        notifyObservers();
    }

    public void notifyObservers(){
        for(int i=0 ; i < observers.size() ; i++){
            observers.get(i).update(temp,humidity,pressure);
        }
    }

}

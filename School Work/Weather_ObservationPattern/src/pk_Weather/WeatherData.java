package pk_Weather;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData()	{
		observers = new ArrayList();
	}
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public float getTemp(){
		return this.temperature;
	}
	
	public float getHumidity(){
		return this.humidity;
	}
	
	public float getPressure(){
		return this.pressure;
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		//measurementsChanged();
	}

	public void notifyObserver(Observer o) {
		o.update(temperature, humidity, pressure);		
	}

}

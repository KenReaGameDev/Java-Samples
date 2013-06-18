package pk_Weather;



public class ForecastDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public ForecastDisplay (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}



	public void Display() {
		System.out.println("Forecast: More of the same");

	}

	public void getUpdate() {
		this.weatherData.notifyObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
			this.temperature = temperature;
			this.humidity = humidity;
			this.pressure = pressure;
			Display();
		
	}

}

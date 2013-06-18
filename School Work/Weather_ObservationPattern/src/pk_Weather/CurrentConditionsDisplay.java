package pk_Weather;



public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float minTemp;
	private float maxTemp;
	private float avgTemp;
	private Subject weatherData;
	
	public CurrentConditionsDisplay( Subject weatherData ){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		if (temperature < minTemp) minTemp = temperature;
		if (temperature > maxTemp) maxTemp = temperature;
		avgTemp = (avgTemp + temperature / 2);
		Display();
	}

	public void Display(){
		System.out.println("Avg/Max/Min temperature = " + minTemp + "/" + maxTemp + "/" + avgTemp);
	}


	public void getUpdate() {
		this.weatherData.notifyObserver(this);
	}


}

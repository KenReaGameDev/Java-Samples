package pk_Weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
	public void getUpdate();
}

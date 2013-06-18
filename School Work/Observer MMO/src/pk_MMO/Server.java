package pk_MMO;

import java.util.ArrayList;

public class Server implements Subject{
	ArrayList records = new ArrayList();

	@Override
	public void notifyObservers() {
		
	}

	@Override
	public void registerObserver(Observer o) {
		records.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		records.remove(o);
	}
	
	
}

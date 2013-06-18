package pk_MMO;

public class Villain implements Observer{
	int health;
	Server serverData;
	
	public Villain(int inHp, Server inServer)
	{
		health = inHp;
		this.serverData = inServer;
	}

	@Override
	public void update(int Health) {
		this.health = Health;
		
	}
	
	public void notifySubject() {
		for (int i = 0; i < this.serverData.records.size(); i++)
		{
			if (this == this.serverData.records.get(i))
			{
				this.serverData.records.set(i, this);
			}
		}
	}

	@Override
	public void pullSubject() {
		for (int i = 0; i < this.serverData.records.size(); i++)
		{
		if (serverData.records.get(i) == )
			
		}
		
	}
}

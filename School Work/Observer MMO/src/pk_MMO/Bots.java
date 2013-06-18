package pk_MMO;

public class Bots implements Observer {
	int health;
	Server serverData;
	
	public Bots(int inHp, Server inServer)
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

	public void pullSubject() {
		// TODO Auto-generated method stub
		
	}
}

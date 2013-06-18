package pk_MMO;

public class Player implements Observer {
	int health;
	int targetHealth;
	Server serverData;

	public Player(int inHp, Server inServer)
	{
		health = inHp;
		this.serverData = inServer;
	}

	public void update(int Health) {
		this.health = Health;

	}

	@Override
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
		// TODO Auto-generated method stub
		
	}
}

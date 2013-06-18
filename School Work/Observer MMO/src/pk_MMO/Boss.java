package pk_MMO;

public class Boss implements Observer {
	int enviromentStrength;
	Server serverData;
	
	public Boss(int inHp, Server inServer)
	{
		enviromentStrength = inHp;
		this.serverData = inServer;
	}

	@Override
	public void update(int Health) {
		this.enviromentStrength = Health;
		
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
}

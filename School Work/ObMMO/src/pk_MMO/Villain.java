package pk_MMO;

import java.util.ArrayList;

public class Villain implements Observer{
	int health;
	Server serverData;
	
	public Villain(int inHp, Server inServer)
	{
		health = inHp;
		this.serverData = inServer;
		serverData.registerObserver(this);
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


	
	public Boolean attack()
	{
		ArrayList enemies = serverData.getRecords();
		Boolean attacked = false;
		for (int i = 0; i < enemies.size(); i++)
		{
			if (enemies.get(i).getClass() == Player.class)
			{
				Player target = (Player) enemies.get(i);
				if (target.health > 0)
				{
					target.update(target.health - 5);
					System.out.println("Villain attacks Player! The Player has " + target.health + " left! ");
					attacked = true;
				}
			}
		}	
		return attacked;
	}
}

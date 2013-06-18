package pk_MMO;

import java.util.ArrayList;

public class Player implements Observer {
	int health;
	int targetHealth;
	Server serverData;

	public Player(int inHp, Server inServer)
	{
		health = inHp;
		this.serverData = inServer;
		serverData.registerObserver(this);
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
	
	public Boolean attack()
	{
		ArrayList enemies = serverData.getRecords();
		Boolean attacked = false;
		for (int i = 0; i < enemies.size(); i++)
		{
			if (enemies.get(i).getClass() == Boss.class)
			{
				Boss target = (Boss) enemies.get(i);
				if (target.health > 0)
				{
					target.update(target.health - 10);
					System.out.println("Player attacks Boss! The Boss has " + target.health + " left! ");
					attacked = true;
				}
			}
			
			if (enemies.get(i).getClass() == Villain.class)
			{
				Villain target = (Villain) enemies.get(i);				
				if (target.health > 0)
				{
					target.update(target.health - 10);
					System.out.println("Player attacks Villain! The Villain has " + target.health + " left! ");
					attacked = true;
				}
			}
		}		
		return attacked;
	}

}

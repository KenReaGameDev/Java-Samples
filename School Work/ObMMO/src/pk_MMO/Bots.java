package pk_MMO;

import java.util.ArrayList;

public class Bots implements Observer {
	int health;
	Server serverData;
	
	public Bots(int inHp, Server inServer)
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
	public void heal()
	{
		ArrayList friendlies = serverData.getRecords();
		
		for (int i = 0; i < friendlies.size(); i++)
		{
			if (friendlies.get(i).getClass() == Player.class)
			{
				Player target = (Player) friendlies.get(i);
				if (target.health > 0)
				{
					target.update(target.health + 1);
					System.out.println("Bot heals Player! The Player has " + target.health + " Now! ");
				}
			}
			
			if (friendlies.get(i).getClass() == Bots.class)
			{
				Bots target = (Bots) friendlies.get(i);
				if (target.health > 0)
				{
					target.update(target.health + 1);
					System.out.println("Bot heals Bot! The Bot has " + target.health + " Now! ");
					
				}
			}
		}		
	}
}

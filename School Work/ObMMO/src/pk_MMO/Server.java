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
	
	public ArrayList getRecords()
	{
		return records;
	}
	
	public Boolean EmulatePlaythrough()
	{
		Boolean attacks = false;
		for (int i = 0; i < records.size(); i++)
		{

			if (records.get(i).getClass() == Boss.class)
			{
				Boss boss = (Boss) records.get(i);
				attacks = boss.attack();

			}
			
			if (records.get(i).getClass() == Player.class)
			{
				Player player = (Player) records.get(i);
				attacks = player.attack();
				
			}
			
			if (records.get(i).getClass() == Villain.class)
			{
				Villain villain = (Villain) records.get(i);
				attacks = villain.attack();
			}
			
			if (records.get(i).getClass() == Bots.class)
			{
				Bots bot = (Bots) records.get(i);
				bot.heal();
			}
			

		}

		return attacks;
		
	}
	
	
	
}

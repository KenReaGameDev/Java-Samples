package pkg_DecMM;

public class Valorous_Bonescythe_Helmet extends Gear{

	Player player;

	public Valorous_Bonescythe_Helmet( Player inPlayer)
	{
		//this.player = inPlayer;
		//this.player.description += this.getDescription();
		//inPlayer = player;
		//this.description = getDescription();
		//this.player = inPlayer;
		//this.player.description += getDescription();
		inPlayer.description += getDescription();
		inPlayer.armor += Armor();
	}
	
	public String getDescription() {
		return "Helmet: A sexy Bonescythe Helmet. It's rather Valorous. ";
	}


	public double Armor() {		
		return 1.59;
	}

}

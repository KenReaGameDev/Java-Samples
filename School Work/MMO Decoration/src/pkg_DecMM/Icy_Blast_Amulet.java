package pkg_DecMM;

public class Icy_Blast_Amulet extends Gear{


	Player player;

	public Icy_Blast_Amulet ( Player inPlayer)
	{
		//this.player = inPlayer;
		//this.player.description += this.getDescription();
		//inPlayer = player;
		//this.description = getDescription();
		inPlayer.description += getDescription();
		inPlayer.armor += Armor();
	}
	
	
	public String getDescription() {
		return "Amulet: Icy Blast Amulet. Frost gathers near its tips. ";
	}


	public double Armor() {		
		return 0.59;
	}

}

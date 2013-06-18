package pkg_DecMM;

public class Necklace_of_Arcane_Spheres extends Gear{


	Player player;

	public Necklace_of_Arcane_Spheres ( Player inPlayer)
	{
		//this.player = inPlayer;
		//this.player.description += this.getDescription();
		//inPlayer = player;
		//this.description = getDescription();
		inPlayer.description += getDescription();
		inPlayer.armor += Armor();
	}
	
	
	public String getDescription() {
		return "Necklace: The Necklace of Arcane Spheres. Crackles of Arcane Magic eminate from the core. ";
	}


	public double Armor() {		
		return 0.59;
	}

}

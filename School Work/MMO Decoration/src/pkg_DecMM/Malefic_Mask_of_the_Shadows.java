package pkg_DecMM;

public class Malefic_Mask_of_the_Shadows extends Gear{


	Player player;

	public Malefic_Mask_of_the_Shadows ( Player inPlayer)
	{
		//this.player = inPlayer;
		//this.player.description += this.getDescription();
		//inPlayer = player;
		//this.description = getDescription();
		inPlayer.description += getDescription();
		inPlayer.armor += Armor();
	}
	
	
	public String getDescription() {
		return "Mask: A Malefic Mask of the Shadows. It's rather Malefic. ";
	}


	public double Armor() {		
		return 0.59;
	}

}

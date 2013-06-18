package pkg_DecMM;

public class CharacterBuilder {
	
	public static void main(String args[]){
		
		Player player = new Mage();
		player = new Valorous_Bonescythe_Helmet(player);
		player = new Malefic_Mask_of_the_Shadows(player);
		player.personalDescription = player.description;
		player.personalArmor = player.armor;
		System.out.println(player.personalDescription + " Armor: " + player.armor);
		
		Player player2 = new Priest();
		player2 = new Valorous_Bonescythe_Helmet(player2);
		player2 = new Malefic_Mask_of_the_Shadows(player2);
		player2 = new Necklace_of_Arcane_Spheres(player2);
		player2.personalDescription = player2.description;
		player2.personalArmor = player2.armor;
		System.out.println(player2.personalDescription + " Armor: " + player2.armor);
		
	}
}

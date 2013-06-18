package pkg_DecMM;

public class Mage extends Player{
	
	
	public Mage() {
		description = "Class: Mage. ";
		armor = 0;
		armor += Armor();
	}
	
	public double Armor() {
		return .5;
	}
}

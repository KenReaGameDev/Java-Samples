package pkg_DecMM;

public class Priest extends Player{
	
	
	public Priest() {
		description = "Class: Priest. ";
		armor = 0;
		armor += Armor();
	}
	
	public double Armor() {
		return 1.5;
	}
}

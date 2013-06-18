package pkg_DecMM;

public  abstract  class Player {
	static String description = "Unknown";
	String personalDescription = "";
	static double armor = 0;
	double personalArmor = 0;
	
	public String getDescription(){
		return description;
	}
	
	public String getDescription2(){
		return personalDescription;
	}
}

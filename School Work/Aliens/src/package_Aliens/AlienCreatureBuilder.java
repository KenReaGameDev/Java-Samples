package package_Aliens;

public abstract class AlienCreatureBuilder {
	
	AlienCreature creature;
	
	public AlienCreature getCreature(){
		return creature;
	}
	
	public void buildNewAlien(){
		creature = new AlienCreature();
	}
	
	public void nameAlien(String inName){
		creature.creatureName = inName;
	}
	
	abstract public void setNumberOfEyes();
	abstract public void setNumberOfArms();
	abstract public void setNumberOfLegs();
	abstract public void setNumberOfNoses();
	abstract public void setNumberOfMouths();
	abstract public void setNumberOfEars();
	abstract public void setNumberOfHands();
}

package package_Aliens;

public class NeptuneAlienCreatureBuilder extends AlienCreatureBuilder{

	@Override
	public void setNumberOfArms() {
		creature.arms.setNumberOfParts(50);
	}

	@Override
	public void setNumberOfEyes() {
		creature.eyes.setNumberOfParts(300);
	}

	@Override
	public void setNumberOfLegs() {
		creature.legs.setNumberOfParts(3);
	}
	
	public void setNumberOfNoses() {
		creature.nose.setNumberOfParts(15);
	}
	
	public void setNumberOfMouths() {
		creature.mouth.setNumberOfParts(3);
	}
	
	public void setNumberOfHands() {
		creature.hands.setNumberOfParts(50);
	}
	
	public void setNumberOfEars() {
		creature.ears.setNumberOfParts(0);
	}
	

}

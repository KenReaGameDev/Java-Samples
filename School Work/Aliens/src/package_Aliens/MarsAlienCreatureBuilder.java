package package_Aliens;

public class MarsAlienCreatureBuilder extends AlienCreatureBuilder{

	
	@Override
	public void setNumberOfEyes() {
		creature.eyes.setNumberOfParts(5);
	}

	@Override
	public void setNumberOfLegs() {
		creature.legs.setNumberOfParts(6);
	}

	@Override
	public void setNumberOfArms() {
		creature.arms.setNumberOfParts(6);
	}
	
	public void setNumberOfNoses() {
		creature.nose.setNumberOfParts(1);
	}
	
	public void setNumberOfMouths() {
		creature.mouth.setNumberOfParts(1);
	}
	
	public void setNumberOfHands() {
		creature.hands.setNumberOfParts(6);
	}
	
	public void setNumberOfEars() {
		creature.ears.setNumberOfParts(2);
	}

}

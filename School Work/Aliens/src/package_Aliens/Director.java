package package_Aliens;



public class Director {
	public static void main(String args[])
	{
		AlienCreature marslien = CreateAlienCreature(new MarsAlienCreatureBuilder(), "George");
		System.out.println("Name: "	+ marslien.getCreatureName()
				+ " Arms: " + marslien.arms.getNumberOfParts()
				+ " Legs: " + marslien.legs.getNumberOfParts()
				+ " Eyes: " + marslien.eyes.getNumberOfParts()
				+ " Nose: " + marslien.nose.getNumberOfParts()
				+ " Mouths: " + marslien.mouth.getNumberOfParts()
				+ " Hands: " + marslien.hands.getNumberOfParts()
				+ " Ears: " + marslien.ears.getNumberOfParts());

		AlienCreature neptunelien = CreateAlienCreature(new NeptuneAlienCreatureBuilder(), "Bill");
		System.out.println("Name: "	+ neptunelien.getCreatureName()
				+ " Arms: " + neptunelien.arms.getNumberOfParts()
				+ " Legs: " + neptunelien.legs.getNumberOfParts()
				+ " Eyes: " + neptunelien.eyes.getNumberOfParts()
				+ " Nose: " + neptunelien.nose.getNumberOfParts()
				+ " Mouths: " + neptunelien.mouth.getNumberOfParts()
				+ " Hands: " + neptunelien.hands.getNumberOfParts()
				+ " Ears: " + neptunelien.ears.getNumberOfParts());
	}

	
	public static AlienCreature CreateAlienCreature(AlienCreatureBuilder alienCreature, 
			String name)
	{
		alienCreature.buildNewAlien();
		alienCreature.nameAlien(name);
		alienCreature.setNumberOfArms();
		alienCreature.setNumberOfEyes();
		alienCreature.setNumberOfLegs();
		alienCreature.setNumberOfHands();
		alienCreature.setNumberOfEars();
		alienCreature.setNumberOfMouths();
		alienCreature.setNumberOfNoses();
		
		return alienCreature.getCreature();
	}

}

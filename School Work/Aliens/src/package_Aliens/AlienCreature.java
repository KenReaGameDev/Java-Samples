package package_Aliens;

import package_Aliens.Alien_BodyParts.Arms;
import package_Aliens.Alien_BodyParts.Ears;
import package_Aliens.Alien_BodyParts.Eyes;
import package_Aliens.Alien_BodyParts.Hands;
import package_Aliens.Alien_BodyParts.Legs;
import package_Aliens.Alien_BodyParts.Mouth;
import package_Aliens.Alien_BodyParts.Nose;



public class AlienCreature {

	public String creatureName;
	public String homePlanet;
	public BodyParts eyes = new Eyes();
	public BodyParts arms = new Arms();
	public BodyParts legs = new Legs();
	public BodyParts nose = new Nose();
	public BodyParts mouth = new Mouth();
	public BodyParts hands = new Hands();
	public BodyParts ears = new Ears();
	
	
	
	



	public String getCreatureName(){
		return creatureName;
	}
}

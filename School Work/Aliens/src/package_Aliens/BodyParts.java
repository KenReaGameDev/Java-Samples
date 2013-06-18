package package_Aliens;

abstract public class BodyParts {

	public int numberOfParts;
	String description;
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String in){
		description = in;
	}
	
	public void setNumberOfParts(int in){
		numberOfParts = in;
	}
	public int getNumberOfParts(){
		return numberOfParts;
	}
}

package pkg_Command;

public class FitnessOffCommand implements Command {
	FitnessDev fitness;
	
	public FitnessOffCommand(FitnessDev fitness){
		this.fitness = fitness;
	}
	public void execute() {
		fitness.FitnessOff();

	}

	@Override
	public void undo() {
		fitness.FitnessOn();
	}

}

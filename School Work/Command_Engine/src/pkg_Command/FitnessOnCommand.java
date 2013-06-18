package pkg_Command;

public class FitnessOnCommand implements Command {
	FitnessDev fitness;
	
	public FitnessOnCommand(FitnessDev fitness){
		this.fitness = fitness;
	}
	public void execute() {
		fitness.FitnessOn();

	}

	@Override
	public void undo() {
		fitness.FitnessOff();
	}

}

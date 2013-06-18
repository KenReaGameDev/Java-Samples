package pkg_Command;

public class BrainOffCommand implements Command {
	BrainDev brain;
	
	public BrainOffCommand(BrainDev brain){
		this.brain = brain;
	}
	public void execute() {
		brain.BrainOff();

	}

	@Override
	public void undo() {
		brain.BrainOn();
	}

}
